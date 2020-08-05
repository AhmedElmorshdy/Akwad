package com.example.akwad.Home_fragment.Details.Presenter;

import com.example.akwad.Home_fragment.Details.UI.DetailView;
import com.example.akwad.ModelView.DetailModel.DetailResponse;
import com.example.akwad.Retrofit_Api.GetRetrofit;
import com.example.akwad.Retrofit_Api.RetrofitInstance;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DetailPresenter implements Detail_Presenter{
    DetailView view;

    public DetailPresenter(DetailView view) {
        this.view = view;
    }

    @Override
    public void getDetails(int i) {

        GetRetrofit lisy = RetrofitInstance.getDetail().create(GetRetrofit.class);
        Call<DetailResponse>call = lisy.getDetail("ar",i,1,2);
        call.enqueue(new Callback<DetailResponse>() {
            @Override
            public void onResponse(Call<DetailResponse> call, Response<DetailResponse> response) {
                if (response.isSuccessful()) {
                    if (response.body().getValue()) {
                        view.onResponsebiggest(response.body().getData().getStoreData());
                    }
                } else {

                }


            }

            @Override
            public void onFailure(Call<DetailResponse> call, Throwable t) {

            }
        });

       
    }
}
