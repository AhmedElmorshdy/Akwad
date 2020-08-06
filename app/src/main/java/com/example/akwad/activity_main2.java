package com.example.akwad;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.akwad.Cetagory.Details.UI.Adapter.AdapterDetailItems;
import com.example.akwad.Cetagory.Details.UI.UI.View_Cetagory;
import com.example.akwad.Cetagory.Details.UI.presenter.Presenter;
import com.example.akwad.ModelView.DetailModel.Coupon;
import com.example.akwad.ModelView.DetailModel.StoreData;
import com.example.akwad.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class activity_main2 extends AppCompatActivity implements View_Cetagory {

    RecyclerView recyclerView;
    AdapterDetailItems adapterDetailItems;
    RecyclerView.LayoutManager layoutManager;
    private ArrayList<Coupon>coupons;
    ImageView imageView;
    TextView textView;
    TextView textView1;
    TextView textView2;
    Presenter presenter;
    int i ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initview();
        setRecyclerView();
        loaddata();

    }

    public void initview() {
        imageView = findViewById(R.id.profile_image);
        textView = findViewById(R.id.namestore1);
        textView1 = findViewById(R.id.textdescription1);
        recyclerView = findViewById(R.id.recycler);

    }

    public  void setRecyclerView(){

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }

    public void loaddata(){
        Intent intent = getIntent();
        i = intent.getIntExtra("id1",0);
        presenter = new Presenter(this);
        presenter.getDetailsitems(i);
    }

    @Override
    public void onResponseDetails(StoreData storeData) {

        String image = storeData.getStoreLogo();
        Picasso.get().load(image).placeholder(R.drawable.akwad1).centerCrop().fit().noFade().into(imageView);
        textView.setText(storeData.getStoreName());
        textView1.setText(storeData.getStoreDescription());


    }

    @Override
    public void onResponselistcoupon(List<Coupon> coupons) {
        this.coupons = new ArrayList<>();
        adapterDetailItems = new AdapterDetailItems(coupons,this);
        recyclerView.setAdapter(adapterDetailItems);
        this.coupons.addAll(coupons);
        adapterDetailItems.notifyDataSetChanged();
        Toast.makeText(this,"hello11",Toast.LENGTH_LONG).show();
    }
}