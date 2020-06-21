package com.example.akwad.Home_frag.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.akwad.ModelView.Coupon;
import com.example.akwad.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class RecentAdapter extends RecyclerView.Adapter<RecentAdapter.viewHolder> {

    List<Coupon>recentcoupons;
    Context context;

    public RecentAdapter(List<Coupon> recentcoupons, Context context) {
        this.recentcoupons = recentcoupons;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recentcoupon,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        Coupon current = recentcoupons.get(position);
        String image = current.getImage();
        Picasso.get().load(image).centerCrop().fit().into(holder.imageView);

        holder.textView.setText(current.getStoreName());

    }

    @Override
    public int getItemCount() {
        return recentcoupons.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.recentcopon_recent_image);
            textView = itemView.findViewById(R.id.recentcopon_recent_name);
        }
    }
}
