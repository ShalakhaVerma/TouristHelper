package ui.activities;

import android.Manifest;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import com.example.shalakhaverma.touristhelper.R;

import java.util.List;

import adapters.ViewPagerAdapter;
import customview.CirclePageIndicator;
import listeners.PlaceDetailListener;
import managers.PlaceDetailManager;
import models.PhotosBean;
import models.PlaceDetails;
import models.Placesearch;
import utils.Constants;

/**
 * Created by shalakha on 16/04/2017.
 */

public class PlaceDetailActivity extends FragmentActivity implements View.OnClickListener,
        PlaceDetailListener, View.OnTouchListener {

    private PlaceDetailManager mPlaceDetailManager;
    private TextView mTextVicinity;
    private TextView mTextCall;
    private TextView mTextWebsite;
    private TextView mTextRating;
    private TextView mTextOpen;
    private String number, website;
    private ViewPager mPager;
    public ViewPagerAdapter mPagerAdapter;
    private double latitude, longitude;
    private FloatingActionButton mFloatingBtn;
    private List<PhotosBean> mPhotosBean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_detail);
        // initialize the controller class of the activity
        mPlaceDetailManager = new PlaceDetailManager();
        // get the  extras from bundle
        Placesearch.ResultsBean mPlaceDetails = (Placesearch.ResultsBean) getIntent().getExtras().getSerializable(Constants.photos_bean_list);
        init();
        // set PlaceDetailListener onto activity
        mPlaceDetailManager.addPlacesDetailListener(this);
        mPlaceDetailManager.getPlaceDetails(this, mPlaceDetails.getPlace_id());
    }

    /*
      @desc method to initialize the view variables of the activity
     */
    private void init() {
        mTextCall = (TextView) findViewById(R.id.text_call);
        mTextOpen = (TextView) findViewById(R.id.text_open);
        mTextRating = (TextView) findViewById(R.id.text_rating);
        mTextWebsite = (TextView) findViewById(R.id.text_website);
        mTextVicinity = (TextView) findViewById(R.id.text_vicinity);
//        mTextType = (TextView)findViewById(R.id.text_type);
        mFloatingBtn = (FloatingActionButton) findViewById(R.id.fab_btn);
        mFloatingBtn.setOnClickListener(this);
        mTextCall.setOnClickListener(this);
        mTextWebsite.setOnClickListener(this);
        mPager = (ViewPager) findViewById(R.id.pager);
        CirclePageIndicator mIndicator = (CirclePageIndicator) findViewById(R.id.indicator);
        mPager.setOnTouchListener(this);

        //set adapter to the view pager
        if (mPagerAdapter == null) {
            mPagerAdapter = new ViewPagerAdapter(this);
            mPager.setAdapter(mPagerAdapter);
            mIndicator.setViewPager(mPager);
        }

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.text_call:
                //Check if Call permissions Available or not
                if (ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                    ActivityCompat.requestPermissions(PlaceDetailActivity.this, new String[]{android.Manifest.permission.CALL_PHONE}, 0);
                } else {
                    try {
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:" + number));
                        startActivity(callIntent);
                    } catch (ActivityNotFoundException e) {
                        e.printStackTrace();
                    }
                }
                break;
            case R.id.text_website:
                try {
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(website));
                    startActivity(i);
                } catch (ActivityNotFoundException e) {
                    e.printStackTrace();
                }
                break;

            case R.id.fab_btn:
                try {
                    Uri gmmIntentUri = Uri.parse("google.navigation:q=" + latitude + "," + longitude);
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    mapIntent.setPackage("com.google.android.apps.maps");
                    startActivity(mapIntent);

                } catch (ActivityNotFoundException e) {
                    e.printStackTrace();
                }

                break;
        }
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (ActivityCompat.checkSelfPermission(this, permissions[0]) == PackageManager.PERMISSION_GRANTED) {
            switch (requestCode) {
                //Call
                case 0:
                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                    callIntent.setData(Uri.parse("tel:" + number));
                    if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        startActivity(callIntent);
                    }
                    break;

            }

        }
    }

    /*
       @desc - Callback method to shows error  when an error occurs while running
       google placed api.
       @param String error- Error Message
      */
    @Override
    public void onError(String error) {
        Snackbar.make(mPager, error, Snackbar.LENGTH_SHORT).show();
    }

    /*
     @desc - Callback method when a successfull google places detail api result
     Also data is set on the view items
     @param PlaceDetails.ResultsBean> results- result data
    */
    @Override
    public void onSuccess(PlaceDetails.ResultBean results) {
        setCollapsingToolbar(results.getName());
        if (results != null && results.getPhotos() != null) {
            mPhotosBean = results.getPhotos();
            mPagerAdapter.setList(mPhotosBean);
            mPagerAdapter.notifyDataSetChanged();
        } else {
            mPager.setVisibility(View.GONE);
            findViewById(R.id.indicator).setVisibility(View.GONE);
        }

        latitude = results.getGeometry().getLocation().getLat();
        longitude = results.getGeometry().getLocation().getLng();

        if (!TextUtils.isEmpty(results.getVicinity()))
            mTextVicinity.setText(results.getVicinity());

        if (!TextUtils.isEmpty(results.getFormatted_phone_number()))
            number = results.getFormatted_phone_number();

        if (!TextUtils.isEmpty(results.getWebsite()))
            website = results.getWebsite();
        else
            mTextWebsite.setVisibility(View.GONE);

        if (results.getRating() != 0.0)
            mTextRating.setText(getString(R.string.rating) + String.valueOf(results.getRating()));
        else
            findViewById(R.id.layout_rating).setVisibility(View.GONE);

        if (results.getOpening_hours() != null) {
            if ((results.getOpening_hours().isOpen_now())) {
                mTextOpen.setTextColor(ContextCompat.getColor(this, R.color.colorPrimary));
                mTextOpen.setText(getString(R.string.open));
            } else {
                mTextOpen.setTextColor(ContextCompat.getColor(this, R.color.red));
                mTextOpen.setText(getString(R.string.closed));
            }
        } else
            findViewById(R.id.layout_open).setVisibility(View.GONE);
    }

    /*
    @desc - Method to set title on CollapsingToolbar
     */
    private void setCollapsingToolbar(String name) {

        CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.main_collapsing);
        collapsingToolbar.setTitle(name);
        collapsingToolbar.setExpandedTitleColor(ContextCompat.getColor(this, R.color.white));
    }

    /*
    @desc - Method to handle touch event on view pager
     */
    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (findViewById(R.id.photos_fragment).getVisibility() == View.GONE) {
            findViewById(R.id.photos_fragment).setVisibility(View.VISIBLE);
            mFloatingBtn.setVisibility(View.GONE);
            mPlaceDetailManager.addFragment(this, R.id.photos_fragment, mPhotosBean);
        }

        return false;
    }

    /*
    @desc - Method to handle back press events
     */
    @Override
    public void onBackPressed() {
        if (getSupportFragmentManager().getBackStackEntryCount() > 0) {
            getSupportFragmentManager().popBackStack();
            mFloatingBtn.setVisibility(View.VISIBLE);
            findViewById(R.id.photos_fragment).setVisibility(View.GONE);
        } else {
            super.onBackPressed();
        }
    }


}
