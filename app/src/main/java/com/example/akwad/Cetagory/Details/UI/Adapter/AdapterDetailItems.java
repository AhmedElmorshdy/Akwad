package com.example.akwad.Cetagory.Details.UI.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.akwad.ModelView.DetailModel.Coupon;
import com.example.akwad.R;

import java.util.List;

public class AdapterDetailItems extends RecyclerView.Adapter<AdapterDetailItems.viewHolder> {

    List<Coupon>coupons;
    Context context;

    public AdapterDetailItems(List<Coupon> coupons, Context context) {
        this.coupons = coupons;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.couponlist,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        Coupon current = coupons.get(position);
        holder.textView.setText(current.getDescription());
        holder.textView1.setText(current.getExpireInDays().toString());
        holder.textView2.setText(current.getCoupon());
        holder.textView3.setText(current.getValue());



    }

    @Override
    public int getItemCount() {
        return coupons.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder{

        TextView textView;
        TextView textView1;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.desc);
            textView1 = itemView.findViewById(R.id.expire);
            textView2 =itemView.findViewById(R.id.value);
            textView3 = itemView.findViewById(R.id.discount);
            textView4 = itemView.findViewById(R.id.hhh);
        }
    }
}
