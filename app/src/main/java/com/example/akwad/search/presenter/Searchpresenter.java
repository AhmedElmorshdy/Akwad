package com.example.akwad.search.presenter;

import com.example.akwad.ModelView.Home_frag.Homefrag_Response;
import com.example.akwad.ModelView.Search.SearchResponse;
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
     Call<SearchResponse>call=list.SEARCH_RESPONSE_CALL("en",edit,1);
     call.enqueue(new Callback<SearchResponse>() {
         @Override
         public void onResponse(Call<SearchResponse> call, Response<SearchResponse> response) {
             view.onResponseResult(response.body().getData().getStores());
         }

         @Override
         public void onFailure(Call<SearchResponse> call, Throwable t) {

         }
     });
    }
}
