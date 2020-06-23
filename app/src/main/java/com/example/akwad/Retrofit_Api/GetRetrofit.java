package com.example.akwad.Retrofit_Api;

import com.example.akwad.ModelView.CetagoryModel.CetagoryResponse;
import com.example.akwad.ModelView.Home_frag.Homefrag_Response;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GetRetrofit {


    @GET("home")
    Call<Homefrag_Response> getHome( @Header("X-localization") String localization,
                                             @Query("country_id") Integer page);

    @GET("categories/{id}")
    Call<CetagoryResponse>getCetagory(@Header("X-localization") String location, @Path("id")int id , @Query("page") Integer page);
}
