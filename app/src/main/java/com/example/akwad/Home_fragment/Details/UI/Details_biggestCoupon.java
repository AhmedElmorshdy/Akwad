package com.example.akwad.Home_fragment.Details.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.akwad.Home_fragment.Details.Presenter.DetailPresenter;
import com.example.akwad.ModelView.DetailModel.StoreData;
import com.example.akwad.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class Details_biggestCoupon extends AppCompatActivity implements DetailView {


    ImageView imageView;
    TextView textView;
    TextView textView1;
    private List<StoreData>storeDataList;
    ImageView imageView1;
    String android;
    ImageView imageView_web;
    ImageView imageView_ios;
    String ios;
    String web;

    int i ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_biggest_coupon);
        imageView = findViewById(R.id.profile_image);
        textView = findViewById(R.id.namestore);
        textView1 = findViewById(R.id.textdescription);
        imageView1 = findViewById(R.id.profile_image_link);
        imageView_ios = findViewById(R.id.profile_image_ios);
        imageView_web = findViewById(R.id.profile_image_web);

                Intent intent = getIntent();
        i = intent.getIntExtra("id",0);
        DetailPresenter detailPresenter = new DetailPresenter(this);
        detailPresenter.getDetails(i);


    }









    @Override
    public void onResponsebiggest(StoreData storeData) {

               String image = "";
               image = storeData.getStoreLogo();
               Picasso.get().load(image).placeholder(R.drawable.akwad1).centerCrop().fit().noFade().into(imageView);
               textView.setText(storeData.getStoreName());
        Toast.makeText(this,"hello",Toast.LENGTH_LONG).show();

         android = storeData.getAndroid();
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(android));
                startActivity(intent);


            }
        });

        ios = storeData.getIos();
        imageView_ios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(ios));
                startActivity(intent);
            }
        });

        web = storeData.getWebsite();
        imageView_web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(web));
                startActivity(intent);
            }
        });




        textView1.setText(storeData.getStoreDescription());


    }

    @Override
    public void fail() {
        Toast.makeText(this,"fail",Toast.LENGTH_LONG
        ).show();
    }
}