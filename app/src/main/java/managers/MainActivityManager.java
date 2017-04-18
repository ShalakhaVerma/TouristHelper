package managers;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.shalakhaverma.touristhelper.R;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import adapters.NearByPlacesAdapter;
import listeners.PlacesSearchListener;
import listeners.RecyclerItemClickListener;
import models.Placesearch;
import retrofit.APIInterface;
import retrofit.ApiClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import ui.activities.PlaceDetailActivity;
import utils.Constants;

/**
 * Created by shalakhaverma on 16/04/2017.
 */

public class MainActivityManager {

    private Context mContext;
    private PlacesSearchListener mPlaceSearchListener;


    /*
  @desc - Method to set error message
   */
    private void setError() {
        if (mPlaceSearchListener != null) {
            mPlaceSearchListener.onError(mContext.getString(R.string.error));
        }
    }

    /*
           @desc - Method to set data on success method of interface
           @param Placesearch.ResultBean placeDetails - resultant data
            */
    private void setSuccess(List<Placesearch.ResultsBean> placeDetails) {
        if (mPlaceSearchListener != null) {
            mPlaceSearchListener.onSuccess(placeDetails);
        }
    }

    /*
    @desc - Method to initialize callback listener
    @param PlacesSearchListener listener - object of PlacesSearchListener
     */
    public void addPlacesSearchListener(PlacesSearchListener listener) {
        this.mPlaceSearchListener = listener;
    }

    /*
 @desc - Method to get all the places of interest from place search api
 @param double latitude - cureent position latitude
  @param double longitude - cureent position longitude
  @param String type - type required to retrieve places based on type
  */
    public void getPlaceSearch(Context context, final double latitude, final double longitude, String type) {
        this.mContext = context;
        try {
            StringBuilder location = new StringBuilder();
            location.append(latitude + "," + longitude);

            Retrofit retrofit = ApiClient.getClient();
            APIInterface apiService = retrofit.create(APIInterface.class);/*Constants.PROXIMITY_RADIUS*/
            Call<Placesearch> call = apiService.getPlacesSearch(location.toString(), mContext.getString(R.string.distance), type, true,
                    mContext.getString(R.string.google_maps_key));
            call.enqueue(new Callback<Placesearch>() {
                @Override
                public void onResponse(Call<Placesearch> call, Response<Placesearch> response) {
                    boolean isSuccess = false;

                    if (response != null) {
                        if (response.body() != null) {
                            if (response.body().getStatus().equalsIgnoreCase("OK")) {
                                List<Placesearch.ResultsBean> results = response.body().getResults();
                                if (results != null) {
                                    isSuccess = true;
                                    showMarkersOnMap(results,latitude,longitude);
                                    setSuccess(results);
                                }
                            }
                        }
                    }

                    if (!isSuccess)
                        setError();
                }

                @Override
                public void onFailure(Call<Placesearch> call, Throwable t) {
                    setError();
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
            setError();
        }
    }

    /*
    @desc - Method to show markers on map
    @param List<Placesearch.ResultsBean> nearbyPlacesLis - list of all the nearby places retrieved
     */
    private void showMarkersOnMap(List<Placesearch.ResultsBean> nearbyPlacesList,double currentLat, double currentLng) {
        ArrayList<LatLng> points = new ArrayList<LatLng>();
        if(nearbyPlacesList!=null && nearbyPlacesList.size()>0) {
            // current location coords as the first coords
            LatLng currentLatLng = new LatLng(currentLat, currentLng);
            points.add(currentLatLng);
            for (int i = 0; i < nearbyPlacesList.size(); i++) {
                MarkerOptions markerOptions = new MarkerOptions();
                Placesearch.ResultsBean resultsBean = nearbyPlacesList.get(i);
                if (resultsBean != null) {

                    double lat = resultsBean.getGeometry().getLocation().getLat();
                    double lng = resultsBean.getGeometry().getLocation().getLng();
                    String placeName = resultsBean.getName();
                    String vicinity = resultsBean.getVicinity();
                    LatLng latLng = new LatLng(lat, lng);
                    markerOptions.position(latLng);
                    markerOptions.title(placeName + " : " + vicinity);

                    points.add(latLng);
                    if (mPlaceSearchListener != null) {
                        mPlaceSearchListener.setMarkers(markerOptions, latLng);
                    }

                }
            }
            // current location coords again to draw loop
            points.add(currentLatLng);
        }
        if (mPlaceSearchListener != null) {
            mPlaceSearchListener.drawRoute(points);
        }

    }


    public RecyclerView.OnItemTouchListener addRecycleViewItemTouchListener(final Context context, RecyclerView recyclerView,
                                                                            final NearByPlacesAdapter adapter) {
        return new RecyclerItemClickListener(context, recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Intent placeDetailIntent = new Intent(mContext, PlaceDetailActivity.class);
                Placesearch.ResultsBean bean = adapter.getItem(position);
                placeDetailIntent.putExtra(Constants.photos_bean_list, (Serializable) bean);
                mContext.startActivity(placeDetailIntent);
            }

            @Override
            public void onLongItemClick(View view, int position) {
                // do whatever
            }
        });

    }


}

