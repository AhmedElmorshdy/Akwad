package com.example.akwad.Cetagory.Presenter;

import com.example.akwad.Cetagory.UI.Cetagory_view;
import com.example.akwad.Home_fragment.Home.Adapters.Presenter.Home_Presenter;
import com.example.akwad.ModelView.CetagoryModel.CetagoryResponse;
import com.example.akwad.ModelView.Home_frag.Homefrag_Response;
import com.example.akwad.Retrofit_Api.GetRetrofit;
import com.example.akwad.Retrofit_Api.RetrofitInstance;
import com.example.akwad.util.SharedPrefManager;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CetagoryPresenter implements CetagoryView , Home_Presenter {
    Cetagory_view view;
    SharedPrefManager sharedPrefManager;

    public CetagoryPresenter(Cetagory_view view) {
        this.view = view;
    }


    @Override
    public void getCetagory(int i) {

        GetRetrofit list = RetrofitInstance.getCetagory().create(GetRetrofit.class);
        Call<CetagoryResponse>call=list.getCetagory("ar",i,1);
        call.enqueue(new Callback<CetagoryResponse>() {
            @Override
            public void onResponse(Call<CetagoryResponse> call, Response<CetagoryResponse> response) {
                view.onResponse_CetagoryItems(response.body().getData().getStores().getStores());


            }

            @Override
            public void onFailure(Call<CetagoryResponse> call, Throwable t) {

            }
        });

    }

    @Override
    public void getHome_frag_Data() {

        GetRetrofit list =RetrofitInstance.getSliders().create(GetRetrofit.class);
        Call<Homefrag_Response>call = list.getHome("en",1);
        call.enqueue(new Callback<Homefrag_Response>() {
            @Override
            public void onResponse(Call<Homefrag_Response> call, Response<Homefrag_Response> response) {
                view.onResponse_CetagorySliders(response.body().getData().getSliders());
                view.onResponse_CetagoryMidBanner(response.body().getData().getMidBanner());

            }

            @Override
            public void onFailure(Call<Homefrag_Response> call, Throwable t) {

            }
        });




    }
}
