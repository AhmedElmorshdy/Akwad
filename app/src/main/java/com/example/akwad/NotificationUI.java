package com.example.akwad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.akwad.ModelView.Notifications.Notification;
import com.example.akwad.More_frag.getNoti.Adpters.NotificationAdapter;
import com.example.akwad.More_frag.getNoti.UI.Viiew_ui;
import com.example.akwad.More_frag.getNoti.presenter.Presenter;


import java.util.ArrayList;
import java.util.List;

public class NotificationUI extends AppCompatActivity implements Viiew_ui {
    RecyclerView recyclerView;
    NotificationAdapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<Notification>notifications;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_u_i);
        recyclerView = findViewById(R.id.notification_recy);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        Presenter presenter = new Presenter(this);
        presenter.getNotification();
    }

    @Override
    public void onResponseNotification(List<Notification> notifications) {
        this.notifications = new ArrayList<>();
        adapter = new NotificationAdapter(notifications,this);
        recyclerView.setAdapter(adapter);
        this.notifications.addAll(notifications);
        adapter.notifyDataSetChanged();
    }
}