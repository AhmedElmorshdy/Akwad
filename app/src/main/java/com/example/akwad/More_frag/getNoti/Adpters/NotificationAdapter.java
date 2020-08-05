package com.example.akwad.More_frag.getNoti.Adpters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.akwad.ModelView.Notifications.Notification;
import com.example.akwad.R;

import java.util.List;

public class NotificationAdapter  extends RecyclerView.Adapter<NotificationAdapter.viewHolder> {

    List<Notification>notifications;
    Context context;

    public NotificationAdapter(List<Notification> notifications, Context context) {
        this.notifications = notifications;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.noti,parent,false);
        return  new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        Notification current = notifications.get(position);
        holder.textView.setText(current.getBody());

    }

    @Override
    public int getItemCount() {
        return notifications.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;


        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageViewnotif);
            textView = itemView.findViewById(R.id.body);
        }
    }
}
