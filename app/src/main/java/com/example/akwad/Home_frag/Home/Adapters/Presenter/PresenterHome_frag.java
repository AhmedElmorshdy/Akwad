package com.example.akwad.Home_frag.Home.Adapters.Presenter;

import com.example.akwad.Home_frag.Home.Adapters.UI.Home_View;
import com.example.akwad.ModelView.Home_frag.Homefrag_Response;
import com.example.akwad.Retrofit_Api.GetRetrofit;
import com.example.akwad.Retrofit_Api.RetrofitInstance;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PresenterHome_frag implements Home_Presenter {

    Home_View view1;

    public PresenterHome_frag(Home_View view1) {
        this.view1 = view1;
    }


    @Override
    public void getHome_frag_Data() {

        GetRetrofit list  = RetrofitInstance.getSliders().create(GetRetrofit.class);
        Call<Homefrag_Response>call = list.getHome("en",1);
        call.enqueue(new Callback<Homefrag_Response>() {
            @Override
            public void onResponse(Call<Homefrag_Response> call, Response<Homefrag_Response> response) {
                if (response.isSuccessful()){
                    if (response.body().getValue()){
                        view1.onResponse(response.body().getData().getSliders());
                        view1.onResponse_BiggestCoupon(response.body().getData().getBiggestCoupon());
                        view1.onResponse_MostClicked(response.body().getData().getMostClicked());
                        view1.onResponse_MidBanners(response.body().getData().getMidBanner());
                        view1.onResponse_recentCoupons(response.body().getData().getRecentCoupons());
                        view1.onResponse_randomCoupon(response.body().getData().getRandomCoupons());
                        view1.onResponse_marketingStors(response.body().getData().getMarketingStores());
                        view1.onResponse_ServiceStores(response.body().getData().getServicesStores());







                    }
                }


            }

            @Override
            public void onFailure(Call<Homefrag_Response> call, Throwable t) {
                view1.onFailure();

            }
        });


    }
}
