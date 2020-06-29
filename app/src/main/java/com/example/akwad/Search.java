package com.example.akwad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

import com.example.akwad.MainActivity;
import com.example.akwad.ModelView.CetagoryModel.Store;
import com.example.akwad.ModelView.Coupon;

import com.example.akwad.R;
import com.example.akwad.search.Adapters.SearchAdapter;
import com.example.akwad.search.presenter.Searchpresenter;

import java.util.ArrayList;
import java.util.List;

public class Search extends AppCompatActivity implements com.example.akwad.search.UI.Search {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    SearchAdapter adapter;
    private ArrayList<Store>stores;
    EditText editText;
    Searchpresenter searchpresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        iniitview();
        setRecyclerView();

        searchpresenter = new Searchpresenter(this);
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

                if (actionId== EditorInfo.IME_ACTION_SEARCH){

                    searchpresenter.getresult(editText.getText().toString());

                }
                return false;
            }
        });


    }

    public  void iniitview(){

        editText = findViewById(R.id.searchresult);
        recyclerView = findViewById(R.id.recy_search);

    }

    public void setRecyclerView(){


        layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true);
        recyclerView.setLayoutManager(layoutManager);


    }



    public void back(View view) {
        finish();
    }

    @Override
    public void onResponseResult(List<Store> stores) {

        this.stores = new ArrayList<>();
        adapter = new SearchAdapter(stores,this);
        recyclerView.setAdapter(adapter);
        this.stores.addAll(stores);
        adapter.notifyDataSetChanged();

    }
}