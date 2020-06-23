package com.example.akwad.Home_frag.Details.Presenter;

import android.widget.Toast;

import com.example.akwad.Home_frag.Details.UI.DetailView;
import com.example.akwad.ModelView.CetagoryModel.CetagoryResponse;
import com.example.akwad.ModelView.DetailModel.DetailResponse;
import com.example.akwad.ModelView.DetailModel.StoreData;
import com.example.akwad.ModelView.Home_frag.Homefrag_Response;
import com.example.akwad.Retrofit_Api.GetRetrofit;
import com.example.akwad.Retrofit_Api.RetrofitInstance;

import java.util.List;

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

    GetRetrofit list = RetrofitInstance.getDetail().create(GetRetrofit.class);
    Call<DetailResponse>call = list.getDetail("en",i,1,2);
    call.enqueue(new Callback<DetailResponse>() {
        @Override
        public void onResponse(Call<DetailResponse> call, Response<DetailResponse> response) {
            if (response.isSuccessful()){
                if (response.body().getValue()){

                    view.onResponsebiggest(response.body().getData().getStoreData());

                }
            }

        }

        @Override
        public void onFailure(Call<DetailResponse> call, Throwable t) {



        }
    });


       
    }
}
