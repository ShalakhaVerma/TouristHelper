package managers;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;

import com.example.shalakhaverma.touristhelper.R;

import java.io.Serializable;
import java.util.List;

import listeners.PlaceDetailListener;
import models.PhotosBean;
import models.PlaceDetails;
import retrofit.APIInterface;
import retrofit.ApiClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import ui.activities.PlaceDetailActivity;
import ui.fragments.PhotosPagerFragment;
import utils.Constants;

/**
 * Created by saurabhverma on 16/04/2017.
 */

public class PlaceDetailManager {
    private Context mContext;
    private PlaceDetailListener mPlaceDetailListener;

    private void setError() {
        if (mPlaceDetailListener != null) {
            mPlaceDetailListener.onError(mContext.getString(R.string.error));
        }
    }


    private void setSuccess(PlaceDetails.ResultBean placeDetails) {
        if (mPlaceDetailListener != null) {
            mPlaceDetailListener.onSuccess(placeDetails);
        }

    }

    public void addPlacesDetailListener(PlaceDetailListener listener) {
        this.mPlaceDetailListener = listener;
    }

    public void getPlaceDetails(Context context, String placeId) {
        this.mContext = context;
        try {
            Retrofit retrofit = ApiClient.getClient();
            APIInterface apiService = retrofit.create(APIInterface.class);
            Call<PlaceDetails> call = apiService.getPlacesDetail(placeId, mContext.getString(R.string.google_maps_key));
            call.enqueue(new Callback<PlaceDetails>() {
                @Override
                public void onResponse(Call<PlaceDetails> call, Response<PlaceDetails> response) {
                    Log.w("REsponse", "Success");
                    if (response != null) {
                        if (response.body() != null) {
                            if (response.body().getStatus().equalsIgnoreCase("OK")) {
                                PlaceDetails.ResultBean results = response.body().getResult();
                                if (results != null) {
                                    setSuccess(results);
                                }
                            }
                        }
                    }
                }

                @Override
                public void onFailure(Call<PlaceDetails> call, Throwable t) {
                    Log.w("REsponse", "Failure");
                    setError();
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
            setError();
        }
    }

    public void addFragment(PlaceDetailActivity activity, int id, List<PhotosBean> mPhotosList) {

        Fragment mPhotosPagerFrag = new PhotosPagerFragment();
        Bundle args = new Bundle();
        args.putSerializable(Constants.photos_bean_list, (Serializable) mPhotosList);
        mPhotosPagerFrag.setArguments(args);
        FragmentManager fragmentManager = activity.getSupportFragmentManager();

        FragmentTransaction ft = fragmentManager.beginTransaction();
        ft.replace(id, mPhotosPagerFrag);
        ft.addToBackStack(null);
        ft.commit();

    }

}
