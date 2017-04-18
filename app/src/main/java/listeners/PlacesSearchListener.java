package listeners;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;
import java.util.List;

import models.Placesearch;

/**
 * Created by saurabhverma on 12/04/2017.
 */

public interface PlacesSearchListener {


    void onError(String error);

    void onSuccess(List<Placesearch.ResultsBean> results);

    void setMarkers(MarkerOptions markerOptions, LatLng latlng, ArrayList<LatLng> points);
}
