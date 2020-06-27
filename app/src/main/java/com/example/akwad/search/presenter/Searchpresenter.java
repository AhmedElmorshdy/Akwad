package com.example.akwad.search.presenter;

import com.example.akwad.ModelView.Home_frag.Homefrag_Response;
import com.example.akwad.Retrofit_Api.GetRetrofit;
import com.example.akwad.Retrofit_Api.RetrofitInstance;
import com.example.akwad.search.UI.Search;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Searchpresenter implements Search_Presenter{
    Search view;

    public Searchpresenter(Search view) {
        this.view = view;
    }

    @Override
    public void getresult(String edit) {
        GetRetrofit list = RetrofitInstance.getSliders().create(GetRetrofit.class);
        Call<Homefrag_Response>call = list.getresult("en",edit);
        call.enqueue(new Callback<Homefrag_Response>() {
            @Override
            public void onResponse(Call<Homefrag_Response> call, Response<Homefrag_Response> response) {
                view.onResponseResult(response.body().getData().getRandomCoupons());

            }

            @Override
            public void onFailure(Call<Homefrag_Response> call, Throwable t) {

            }
        });
    }
}
