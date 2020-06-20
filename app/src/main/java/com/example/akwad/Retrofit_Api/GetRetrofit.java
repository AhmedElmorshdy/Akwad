package com.example.akwad.Retrofit_Api;

import com.example.akwad.Home_frag.ModelView.Homefrag_Response;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface GetRetrofit {


    @GET("home")
    Call<Homefrag_Response> getHome( @Header("X-localization") String localization,
                                             @Query("country_id") Integer page);
}
