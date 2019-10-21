package com.tatayab.tatayab.adapaters;


import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.viewpager.widget.PagerAdapter;


import com.squareup.picasso.Picasso;
import com.tatayab.tatayab.R;
import com.tatayab.tatayab.model.BannerResponseParser;

import java.util.ArrayList;

public class FirstImageAdapter extends PagerAdapter {



        private LayoutInflater inflater;
        private Context context;
        private ArrayList<BannerResponseParser.Banner> urls;

        public FirstImageAdapter(Context context, ArrayList<BannerResponseParser.Banner> urls) {
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
            View imageLayout = inflater.inflate(R.layout.firstadapter, view, false);

            assert imageLayout != null;
            final ImageView imageView = (ImageView) imageLayout
                    .findViewById(R.id.image);
            Picasso.with(context).load(urls.get(position).getMainPair().getIcon().getImagePath()).into(imageView);
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


