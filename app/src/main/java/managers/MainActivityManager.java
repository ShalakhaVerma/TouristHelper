package managers;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
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
 * Created by saurabhverma on 12/04/2017.
 */

public class MainActivityManager {

    private Context mContext;
    private PlacesSearchListener mPlaceSearchListener;


    public void addPlacesSearchListener(PlacesSearchListener listener) {
        this.mPlaceSearchListener = listener;
    }

    public void getPlaceSearch(Context context, double latitude, double longitude, String nearbyPlace) {
        this.mContext = context;
        try {
            StringBuilder location = new StringBuilder();
            location.append(latitude + "," + longitude);

            Retrofit retrofit = ApiClient.getClient();
            APIInterface apiService = retrofit.create(APIInterface.class);/*Constants.PROXIMITY_RADIUS*/
            Call<Placesearch> call = apiService.getPlacesSearch(location.toString(), "distance", nearbyPlace, true,
                    mContext.getString(R.string.google_maps_key));
            call.enqueue(new Callback<Placesearch>() {
                @Override
                public void onResponse(Call<Placesearch> call, Response<Placesearch> response) {
                    Log.w("REsponse", "Success");
                    if (response != null) {
                        if (response.body() != null) {
                            if (response.body().getStatus().equalsIgnoreCase("OK")) {
                                List<Placesearch.ResultsBean> results = response.body().getResults();
                                if (results != null) {
                                    showMarkersOnMap(results);
                                    setSuccess(results);
                                }
                            }
                        }
                    }
                }

                @Override
                public void onFailure(Call<Placesearch> call, Throwable t) {
                    Log.w("REsponse", "Failure");
                    setError();
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
            setError();
        }
    }

    private void setError() {
        if (mPlaceSearchListener != null) {
            mPlaceSearchListener.onError(mContext.getString(R.string.error));
        }
    }


    private void setSuccess(List<Placesearch.ResultsBean> placeDetails) {
        if (mPlaceSearchListener != null) {
            mPlaceSearchListener.onSuccess(placeDetails);
        }

    }


    private void showMarkersOnMap(List<Placesearch.ResultsBean> nearbyPlacesList) {
        ArrayList<LatLng> points = new ArrayList<LatLng>();
        ;

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
                    mPlaceSearchListener.setMarkers(markerOptions, latLng, points);
                }

            }
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

