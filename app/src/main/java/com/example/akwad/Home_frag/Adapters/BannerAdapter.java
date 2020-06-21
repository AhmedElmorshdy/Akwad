package com.example.akwad.Home_frag.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.akwad.ModelView.MidBanner;
import com.example.akwad.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class BannerAdapter extends RecyclerView.Adapter<BannerAdapter.viewHolder> {
    List <MidBanner>midBanners;
    Context context;

    public BannerAdapter(List<MidBanner> midBanners, Context context) {
        this.midBanners = midBanners;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.midbanner,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        MidBanner current = midBanners.get(position);
        String  image = current.getImage();
        Picasso.get().load(image).centerCrop().fit().into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return midBanners.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;


        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_Banner);
        }
    }
}
