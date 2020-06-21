package com.example.akwad.Home_frag.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.akwad.ModelView.MarketingStore;
import com.example.akwad.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MarketingAdapter extends RecyclerView.Adapter<MarketingAdapter.viewHolder> {

    List<MarketingStore>marketingStores;
    Context context;

    public MarketingAdapter(List<MarketingStore> marketingStores, Context context) {
        this.marketingStores = marketingStores;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.marketingstore,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        MarketingStore current = marketingStores.get(position);
        String image = current.getImage();
        Picasso.get().load(image).centerCrop().fit().into(holder.imageView);

        holder.textView.setText(current.getName());

    }

    @Override
    public int getItemCount() {
        return marketingStores.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.marketing_storeImage);
            textView = itemView.findViewById(R.id.marketing_storeName);
        }
    }
}
