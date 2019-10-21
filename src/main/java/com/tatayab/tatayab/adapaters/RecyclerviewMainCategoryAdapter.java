package com.tatayab.tatayab.adapaters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;
import com.tatayab.tatayab.R;
import com.tatayab.tatayab.model.MainCategoryListResponseParser;

import java.util.ArrayList;

public class RecyclerviewMainCategoryAdapter extends RecyclerView.Adapter<RecyclerviewMainCategoryAdapter.MainCategoryViewHolder> {
    private ArrayList<MainCategoryListResponseParser.Category> categoryArrayList;
    Context context;

    public RecyclerviewMainCategoryAdapter(ArrayList<MainCategoryListResponseParser.Category> categoryArrayList, Context context) {
        this.categoryArrayList = categoryArrayList;
        this.context = context;
    }

    @Override
    public RecyclerviewMainCategoryAdapter.MainCategoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflate the layout file
        View groceryProductView = LayoutInflater.from(parent.getContext()).inflate(R.layout.maincategoryadapter, parent, false);
        MainCategoryViewHolder gvh = new MainCategoryViewHolder(groceryProductView);
        return gvh;
    }

    @Override
    public void onBindViewHolder(RecyclerviewMainCategoryAdapter.MainCategoryViewHolder holder, final int position) {


       Picasso.with(context).load(categoryArrayList.get(position).getImagePath()).into(holder.imageView);
        holder.txtview.setText(categoryArrayList.get(position).getCategory());

    }

    @Override
    public int getItemCount() {
        return categoryArrayList.size();
    }

    public class MainCategoryViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView txtview;

        public MainCategoryViewHolder(View view) {
            super(view);
            imageView = view.findViewById(R.id.image);
            txtview = view.findViewById(R.id.descrp_textView);
        }
    }
}