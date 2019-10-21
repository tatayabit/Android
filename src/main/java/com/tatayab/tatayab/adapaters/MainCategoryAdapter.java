package com.tatayab.tatayab.adapaters;

import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.squareup.picasso.Picasso;
import com.tatayab.tatayab.R;
import com.tatayab.tatayab.model.MainCategoryListResponseParser;

import java.util.ArrayList;

public class MainCategoryAdapter extends PagerAdapter {
    private LayoutInflater inflater;
    private Context context;
    private ArrayList<MainCategoryListResponseParser.Category> urls;

    public MainCategoryAdapter(Context context, ArrayList<MainCategoryListResponseParser.Category> urls) {
        this.context = context;
        this.urls = urls;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public int getCount() {
        return urls.size();
    }

    @Override
    public Object instantiateItem(ViewGroup view, int position) {
        View imageLayout = inflater.inflate(R.layout.maincategoryadapter, view, false);

        assert imageLayout != null;
        final ImageView imageView = (ImageView) imageLayout
                .findViewById(R.id.image);
        final TextView descrptionTextview = (TextView) imageLayout
                .findViewById(R.id.descrp_textView);
        Picasso.with(context).load(urls.get(position).getImagePath()).into(imageView);
        descrptionTextview.setText(urls.get(position).getCategory());

        view.addView(imageLayout);

        return imageLayout;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view.equals(object);
    }

    @Override
    public void restoreState(Parcelable state, ClassLoader loader) {
    }

    @Override
    public Parcelable saveState() {
        return null;
    }
}
