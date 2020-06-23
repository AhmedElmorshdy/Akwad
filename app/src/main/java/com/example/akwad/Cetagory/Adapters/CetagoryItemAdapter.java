package com.example.akwad.Cetagory.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.akwad.ModelView.CetagoryModel.Store;
import com.example.akwad.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CetagoryItemAdapter extends RecyclerView.Adapter<CetagoryItemAdapter.viewHolder> {

    List<Store>stores;
    Context context;


    public CetagoryItemAdapter(List<Store> stores, Context context) {
        this.stores = stores;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.cetagoryitems,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        Store current = stores.get(position);
        String image = current.getImage();
        Picasso.get().load(image).centerCrop().fit().into(holder.imageView);

        holder.textView.setText(current.getName());

    }

    @Override
    public int getItemCount() {
        return stores.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.cetagory_storeImage);
            textView = itemView.findViewById(R.id.cetagory_storeName);
        }
    }
}
