package ui.activities;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.shalakhaverma.touristhelper.R;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

import java.util.ArrayList;
import java.util.List;

import adapters.NearByPlacesAdapter;
import listeners.PlacesSearchListener;
import managers.MainActivityManager;
import models.Placesearch;
import utils.AppUtil;
import utils.Constants;

/**
 * Created by shalakha on 16/04/2017.
 */

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback,
        GoogleApiClient.ConnectionCallbacks,
        GoogleApiClient.OnConnectionFailedListener,
        LocationListener,
        PlacesSearchListener {

    private GoogleMap mMap;
    private GoogleApiClient mGoogleApiClient;
    private LocationRequest mLocationRequest;
    private Location mLastLocation;
    private Marker mCurrLocationMarker;
    private MainActivityManager mTouristHelperManager;
//    double latitude = -37.89133;
//    double longitude = 145.07046;
    private NearByPlacesAdapter mAdapter;
    private RecyclerView mRecyclerView;
    private List<Placesearch.ResultsBean> nearbyPlacesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//         initialize the controller class of the activity
        mTouristHelperManager = new MainActivityManager();
        // set PlaceSearchListener onto activity
        mTouristHelperManager.addPlacesSearchListener(this);

        //Check if Google Location permission  Available or not
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            AppUtil.checkLocationPermission(this);
        }

        //Check if Google Play Services Available or not
        if (!AppUtil.CheckGooglePlayServices(this)) {
            finish();
        } else {
//            Log.d("onCreate", "Google Play Services available.");
        }

        init();

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        //Initialize Google Play Services
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (ContextCompat.checkSelfPermission(this,
                    Manifest.permission.ACCESS_FINE_LOCATION)
                    == PackageManager.PERMISSION_GRANTED) {
                buildGoogleApiClient();
                mMap.setMyLocationEnabled(true);
            }
        } else {
            buildGoogleApiClient();
            mMap.setMyLocationEnabled(true);
        }

    }

    /*
      @desc method to build Google Api client
     */
    protected synchronized void buildGoogleApiClient() {
        mGoogleApiClient = new GoogleApiClient.Builder(this)
                .addConnectionCallbacks(this)
                .addOnConnectionFailedListener(this)
                .addApi(LocationServices.API)
                .build();
        mGoogleApiClient.connect();
    }

    /*
      @desc method to initialize the view variables of the activity
     */
    private void init() {
        setCollapsingToolbar();
        mRecyclerView = (RecyclerView) findViewById(R.id.rv_recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mAdapter = new NearByPlacesAdapter(nearbyPlacesList, this);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.addOnItemTouchListener(mTouristHelperManager.addRecycleViewItemTouchListener(this, mRecyclerView, mAdapter));
    }

    /*
   @desc - Method to set title on CollapsingToolbar
    */
    private void setCollapsingToolbar() {
        CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.main_collapsing);
        collapsingToolbar.setTitle(getString(R.string.app_name));
        collapsingToolbar.setExpandedTitleColor(ContextCompat.getColor(this, R.color.trans));
    }

    @Override
    public void onConnected(Bundle bundle) {
        mLocationRequest = new LocationRequest();
        mLocationRequest.setInterval(Constants.TIME_INTERVAL_MILLISECONDS);
        mLocationRequest.setFastestInterval(Constants.TIME_INTERVAL_MILLISECONDS);
        mLocationRequest.setPriority(LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY);
        if (ContextCompat.checkSelfPermission(this,
                Manifest.permission.ACCESS_FINE_LOCATION)
                == PackageManager.PERMISSION_GRANTED) {
            LocationServices.FusedLocationApi.requestLocationUpdates(mGoogleApiClient, mLocationRequest, this);
        }


    }

    @Override
    public void onConnectionSuspended(int i) {

    }

    @Override
    public void onConnectionFailed(ConnectionResult connectionResult) {

    }

    @Override
    public void onLocationChanged(Location location) {
       Location mLastLocation = location;
        try {
            if (mCurrLocationMarker != null) {
                mCurrLocationMarker.remove();
            }

            //Place current location marker
            double latitude = mLastLocation.getLatitude();
            double longitude = mLastLocation.getLongitude();


            // call to google places search api to find all places of interest
            mTouristHelperManager.getPlaceSearch(this, latitude, longitude, "point_of_interest");


            LatLng latLng = new LatLng(mLastLocation.getLatitude(), mLastLocation.getLongitude());
            MarkerOptions markerOptions = new MarkerOptions();
            markerOptions.position(latLng);
            markerOptions.title("Current Position");
            markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
            mCurrLocationMarker = mMap.addMarker(markerOptions);

            //move map camera
            mMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(15));

            //stop location updates
            if (mGoogleApiClient != null) {
                LocationServices.FusedLocationApi.removeLocationUpdates(mGoogleApiClient, this);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    /*
      @desc - Callback method to shows error  when an error occurs while running
      google placed api.
      @param String error- Error Message
     */
    @Override
    public void onError(String error) {
        Snackbar.make(mRecyclerView, error, Snackbar.LENGTH_SHORT).show();
    }

    /*
     @desc - Callback method when a successfull google places search api result
     @param Placesearch.ResultsBean> results- result data
    */
    @Override
    public void onSuccess(List<Placesearch.ResultsBean> results) {
        //if the list not empty clears the old data if any
        if (nearbyPlacesList != null)
            nearbyPlacesList.clear();

        nearbyPlacesList = results;
        mAdapter.setNearbyPlacesList(nearbyPlacesList);
        mAdapter.notifyDataSetChanged();
    }

    /*
            @desc - Method to draw routes between all markers
            @param - ArrayList<LatLng> points - List of  LatLng of the two coordinates
           */
    @Override
    public void drawRoute(ArrayList<LatLng> points) {
        PolylineOptions lineOptions = new PolylineOptions();
        lineOptions.addAll(points);
        lineOptions.width(20);
        lineOptions.color(Color.BLUE);

        // Drawing polyline in the Google Map for the i-th route
        if (lineOptions != null) {
            mMap.addPolyline(lineOptions);
        }
    }

    /*
             @desc - Method to set markers on google maps. Also draw routes between all markers
             @param MarkerOptions markerOptions
             @param LatLng latLng - Lat Lng of the marked position
            */
    @Override
    public void setMarkers(MarkerOptions markerOptions, LatLng latLng) {
        if (mMap != null) {
            mMap.addMarker(markerOptions);
            markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
            //move map camera
            mMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(15));

        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           String permissions[], int[] grantResults) {
        switch (requestCode) {
            case Constants.MY_PERMISSIONS_REQUEST_LOCATION: {
                // If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                    // permission was granted. Do the
                    // contacts-related task you need to do.
                    if (ContextCompat.checkSelfPermission(this,
                            Manifest.permission.ACCESS_FINE_LOCATION)
                            == PackageManager.PERMISSION_GRANTED) {

                        if (mGoogleApiClient == null) {
                            buildGoogleApiClient();
                        }
                        mMap.setMyLocationEnabled(true);
                    }

                } else {

                    // Permission denied, Disable the functionality that depends on this permission.
                    Toast.makeText(this, "permission denied", Toast.LENGTH_LONG).show();
                }
                return;
            }

            // other 'case' lines to check for other permissions this app might request.
            // You can add here other case statements according to your requirement.
        }
    }

}
