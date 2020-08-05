package com.example.akwad.More_frag.getNoti.presenter;

import com.example.akwad.ModelView.Notifications.NotificationResponse;
import com.example.akwad.More_frag.getNoti.UI.Viiew_ui;

import com.example.akwad.Retrofit_Api.GetRetrofit;
import com.example.akwad.Retrofit_Api.RetrofitInstance;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Presenter implements Vew_presenter  {
    Viiew_ui viiew_ui;

    public Presenter(Viiew_ui viiew_ui) {
        this.viiew_ui = viiew_ui;
    }

    @Override
    public void getNotification() {
        GetRetrofit list = RetrofitInstance.getNoti().create(GetRetrofit.class);
        Call<NotificationResponse>call = list.gwtNotification("en",1);
        call.enqueue(new Callback<NotificationResponse>() {
            @Override
            public void onResponse(Call<NotificationResponse> call, Response<NotificationResponse> response) {
                viiew_ui.onResponseNotification(response.body().getData().getNotifications());
            }

            @Override
            public void onFailure(Call<NotificationResponse> call, Throwable t) {

            }
        });
    }
}
