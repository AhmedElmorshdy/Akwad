package com.example.akwad.Cetagory.Details.UI.presenter;

import com.example.akwad.Cetagory.Details.UI.UI.View_Cetagory;
import com.example.akwad.ModelView.CetagoryModel.CetagoryResponse;
import com.example.akwad.ModelView.DetailModel.DetailResponse;
import com.example.akwad.Retrofit_Api.GetRetrofit;
import com.example.akwad.Retrofit_Api.RetrofitInstance;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Presenter implements View_presenter {

    View_Cetagory view_cetagory;

    public Presenter(View_Cetagory view_cetagory) {
        this.view_cetagory = view_cetagory;
    }

    @Override
    public void getDetailsitems(int i) {
     GetRetrofit list = RetrofitInstance.getDetail().create(GetRetrofit.class);
     Call<DetailResponse> call = list.getDetail("en",i,1,2);
     call.enqueue(new Callback<DetailResponse>() {
         @Override
         public void onResponse(Call<DetailResponse> call, Response<DetailResponse> response) {
             view_cetagory.onResponseDetails(response.body().getData().getStoreData());
             view_cetagory.onResponselistcoupon(response.body().getData().getCoupons());
         }

         @Override
         public void onFailure(Call<DetailResponse> call, Throwable t) {

         }
     });
    }
}
