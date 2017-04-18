package ui.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shalakhaverma.touristhelper.R;

import java.util.List;

import adapters.ViewPagerAdapter;
import customviews.circleindicator.CirclePageIndicator;
import models.PhotosBean;
import models.Placesearch;
import utils.Constants;

/**
 * Created by saurabhverma on 16/04/2017.
 */

public class PhotosPagerFragment extends Fragment {

    private ViewPager mPager;
    private ViewPagerAdapter mPagerAdapter;
    private List<PhotosBean> mPhotosBeanList;
    private CirclePageIndicator mIndicator;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = LayoutInflater.from(container.getContext())
                .inflate(R.layout.fragment_photos_pager, container, false);

        mPager = (ViewPager) v.findViewById(R.id.pager);
        mIndicator = (CirclePageIndicator) v.findViewById(R.id.indicator);
        return v;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        if (mPagerAdapter == null) {
            mPhotosBeanList = (List<PhotosBean>) getArguments().getSerializable(Constants.photos_bean_list);
            mPagerAdapter = new ViewPagerAdapter(getActivity());
            mPagerAdapter.setList(mPhotosBeanList);
            mPager.setAdapter(mPagerAdapter);
            mIndicator.setViewPager(mPager);
        }

    }
}
