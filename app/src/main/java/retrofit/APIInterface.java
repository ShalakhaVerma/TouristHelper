package retrofit;

import models.PlaceDetails;
import models.Placesearch;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by saurabhverma on 8/04/2017.
 */

public interface APIInterface {

    @GET("/maps/api/place/nearbysearch/json")
    Call<Placesearch> getPlacesSearch(@Query("location") String location, @Query("rankby") String radius,
                                      @Query("type") String type, @Query("sensor") boolean sensor,
                                      @Query("key") String key);

    @GET("/maps/api/place/details/json")
    Call<PlaceDetails> getPlacesDetail(@Query("placeid") String placeid,
                                       @Query("key") String key);

}
