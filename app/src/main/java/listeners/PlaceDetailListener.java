package listeners;

import models.PlaceDetails;

/**
 * Created by saurabhverma on 16/04/2017.
 */

public interface PlaceDetailListener {
    void onError(String error);
    void onSuccess(PlaceDetails.ResultBean results);
}