package com.example.akwad.Home_frag.Details.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.akwad.Home_frag.Details.Presenter.DetailPresenter;
import com.example.akwad.ModelView.DetailModel.StoreData;
import com.example.akwad.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class Details_biggestCoupon extends AppCompatActivity implements DetailView {


    ImageView imageView;
    TextView textView;
    TextView textView1;
    private List<StoreData>storeDataList;

    int i ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_biggest_coupon);
        imageView = findViewById(R.id.profile_image);
        textView = findViewById(R.id.namestore);
        textView1 = findViewById(R.id.textdescription);

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


    }

    @Override
    public void fail() {
        Toast.makeText(this,"fail",Toast.LENGTH_LONG
        ).show();
    }
}