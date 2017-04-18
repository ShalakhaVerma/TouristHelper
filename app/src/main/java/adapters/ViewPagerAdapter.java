package adapters;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.shalakhaverma.touristhelper.R;
import com.squareup.picasso.Picasso;

import java.util.List;

import models.PhotosBean;

/**
 * Created by saurabhverma on 16/04/2017.
 */

public class ViewPagerAdapter extends PagerAdapter {

    Context mContext;
    LayoutInflater mLayoutInflater;
    List<PhotosBean> mResources;


    public ViewPagerAdapter(Context context) {
        mContext = context;
        mLayoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public void setList(List<PhotosBean> mResources) {
        this.mResources = mResources;
    }

    @Override
    public int getCount() {
        if (mResources != null)
            return mResources.size();
        else
            return 0;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((LinearLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View itemView = mLayoutInflater.inflate(R.layout.pager_item, container, false);

        ImageView imageView = (ImageView) itemView.findViewById(R.id.imageView);
        if (mResources != null && mResources.get(position) != null) {

            String photo_reference = mResources.get(position).getPhoto_reference();
            String url = "https://maps.googleapis.com/maps/api/place/photo?maxwidth=1200" + "&maxheight=1200" +
                    "&photoreference=" + photo_reference + "&key=" + mContext.getString(R.string.google_maps_key);
            Log.w("Image pos ", position + "");
            Log.w("Image URL ", position + "     " + url);
            Picasso.with(mContext).load(url).into(imageView);
        } else
            imageView.setImageDrawable(ContextCompat.getDrawable(mContext, R.mipmap.ic_launcher));
        ;

        container.addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }
}
