package adapters;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.shalakhaverma.touristhelper.R;
import com.squareup.picasso.Picasso;

import java.util.List;

import models.Placesearch;

/**
 * Created by saurabhverma on 12/04/2017.
 */

public class NearByPlacesAdapter extends RecyclerView.Adapter<NearByPlacesAdapter.ViewHolder> {
    private static final String TAG = "NearByPlacesAdapter";

    private List<Placesearch.ResultsBean> nearbyPlacesList;
    private Context mContext;


    public void setNearbyPlacesList(List<Placesearch.ResultsBean> nearbyPlacesList) {
        this.nearbyPlacesList = nearbyPlacesList;
    }

    /**
     * Provide a reference to the type of views that you are using (custom ViewHolder)
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView name, ratings, address, openNow;
        public View mView;
        public ImageView mPhoto;


        public ViewHolder(View view) {
            super(view);
            mView = view;
            name = (TextView) view.findViewById(R.id.text_name);
            ratings = (TextView) view.findViewById(R.id.text_rating);
            address = (TextView) view.findViewById(R.id.text_address);
            openNow = (TextView) view.findViewById(R.id.text_open);
            mPhoto = (ImageView) view.findViewById(R.id.image_photo);

        }
    }

    /**
     * Initialize the dataset of the Adapter.
     *
     * @param nearbyPlacesList List<Placesearch.ResultsBean> containing the data to populate views to be used by RecyclerView.
     */
    public NearByPlacesAdapter(List<Placesearch.ResultsBean> nearbyPlacesList, Context mContext) {
        this.mContext = mContext;
        this.nearbyPlacesList = nearbyPlacesList;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view.
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.places_row_item, viewGroup, false);

        return new ViewHolder(v);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        Log.d(TAG, "Element " + position + " set.");

        // Get element from your dataset at this position and replace the contents of the view
        // with that element
        if (nearbyPlacesList != null && nearbyPlacesList.get(position) != null) {
            if (!TextUtils.isEmpty(nearbyPlacesList.get(position).getName()))
                viewHolder.name.setText(nearbyPlacesList.get(position).getName());

            if (nearbyPlacesList.get(position).getRating() != 0.0)
                viewHolder.ratings.setText(mContext.getString(R.string.rating) + String.valueOf(nearbyPlacesList.get(position).getRating()));
            else
                viewHolder.ratings.setVisibility(View.GONE);

            if (!TextUtils.isEmpty(nearbyPlacesList.get(position).getVicinity()))
                viewHolder.address.setText(nearbyPlacesList.get(position).getVicinity());

            if (nearbyPlacesList.get(position).getOpening_hours() != null) {
                if ((nearbyPlacesList.get(position).getOpening_hours().isOpen_now())) {
                    viewHolder.openNow.setTextColor(ContextCompat.getColor(mContext, R.color.colorPrimary));
                    viewHolder.openNow.setText(mContext.getString(R.string.open));
                } else {
                    viewHolder.openNow.setTextColor(ContextCompat.getColor(mContext, R.color.red));
                    viewHolder.openNow.setText(mContext.getString(R.string.closed));
                }
            } else
                viewHolder.openNow.setVisibility(View.GONE);
            if (nearbyPlacesList.get(position).getPhotos() != null) {
                if (nearbyPlacesList.get(position).getPhotos().size() > 0 &&
                        nearbyPlacesList.get(position).getPhotos().get(0) != null) {
                    String photoRef = nearbyPlacesList.get(position).getPhotos().get(0).getPhoto_reference();

                    String url = "https://maps.googleapis.com/maps/api/place/photo?maxwidth=1200" + "&maxheight=1200" +
                            "&photoreference=" + photoRef + "&key=" + mContext.getString(R.string.google_maps_key);
                    Log.w("Image pos ", position + "");
                    Log.w("Image URL ", position + "     " + url);
                    Picasso.with(mContext).load(url).into(viewHolder.mPhoto);
                } else
                    viewHolder.mPhoto.setImageDrawable(ContextCompat.getDrawable(mContext, R.mipmap.ic_launcher));

            } else
                viewHolder.mPhoto.setImageDrawable(ContextCompat.getDrawable(mContext, R.mipmap.ic_launcher));

        }
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        if (nearbyPlacesList != null && nearbyPlacesList.size() > 0)
            return nearbyPlacesList.size();
        else
            return 0;
    }

    public Placesearch.ResultsBean getItem(int position) {
        return nearbyPlacesList.get(position);

    }


}
