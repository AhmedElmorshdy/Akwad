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
import com.example.akwad.ModelView.Slider;
import com.example.akwad.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class BiggestCoupon_Adapter extends RecyclerView.Adapter<BiggestCoupon_Adapter.viewHolder> {

    List<Coupon>biggestCoupons;
    Context context;

    public BiggestCoupon_Adapter(List<Coupon> biggestCoupons, Context context) {
        this.biggestCoupons = biggestCoupons;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.bigges_coupon,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        Coupon current = biggestCoupons.get(position);
        String image = current.getImage();
        Picasso.get().load(image).centerCrop().centerCrop().fit().into(holder.imageView);

        holder.textView.setText(current.getValue());


    }

    @Override
    public int getItemCount() {
        return biggestCoupons.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.biggest_couponImage);
            textView = itemView.findViewById(R.id.biggest_couponName);
        }
    }
}
