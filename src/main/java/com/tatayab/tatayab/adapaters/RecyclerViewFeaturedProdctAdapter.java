/*
package com.tatayab.tatayab.adapaters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.tatayab.tatayab.R;

public class RecyclerViewFeaturedProdctAdapter extends RecyclerView.Adapter<RecyclerViewFeaturedProdctAdapter.FeaturedProductViewHolder>{
    private List<Grocery> horizontalGrocderyList;
    Context context;

    public RecyclerViewFeaturedProdctAdapter(List<Grocery> horizontalGrocderyList, Context context){
        this.horizontalGrocderyList= horizontalGrocderyList;
        this.context = context;
    }

    @Override
    public FeaturedProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflate the layout file
        View groceryProductView = LayoutInflater.from(parent.getContext()).inflate(R.layout.featuredproductitems, parent, false);
        GroceryViewHolder gvh = new GroceryViewHolder(groceryProductView);
        return gvh;
    }

    @Override
    public void onBindViewHolder(FeaturedProductViewHolder holder, final int position) {
        holder.imageView.setImageResource(horizontalGrocderyList.get(position).getProductImage());
        holder.txtview.setText(horizontalGrocderyList.get(position).getProductName());
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String productName = horizontalGrocderyList.get(position).getProductName().toString();
                Toast.makeText(context, productName + " is selected", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return horizontalGrocderyList.size();
    }

    public class FeaturedProductViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView txtview;
        public FeaturedProductViewHolder(View view) {
            super(view);
            imageView=view.findViewById(R.id.idProductImage);
            txtview=view.findViewById(R.id.idProductName);
        }
    }
}*/
