package com.example.akwad.Home_frag.Slider_recy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.akwad.Home_frag.ModelView.Slider;
import com.example.akwad.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class SliderAdapter extends RecyclerView.Adapter<SliderAdapter.viewHolder> {

    List<Slider>sliders;
    Context context;

    public SliderAdapter(List<Slider> sliders, Context context) {
        this.sliders = sliders;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.slideres,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        Slider current = sliders.get(position);
        String image = current.getImage();
        Picasso.with(context).load(image).into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return sliders.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;


        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_sliders);
        }
    }
}
