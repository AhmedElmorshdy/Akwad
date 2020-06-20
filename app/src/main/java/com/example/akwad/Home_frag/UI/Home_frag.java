package com.example.akwad.Home_frag.UI;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.akwad.Home_frag.Adapters.BiggestCoupon_Adapter;
import com.example.akwad.Home_frag.Adapters.MostClicked_Adapter;
import com.example.akwad.Home_frag.Presenter.PresenterHome_frag;
import com.example.akwad.ModelView.Coupon;
import com.example.akwad.ModelView.Slider;
import com.example.akwad.Home_frag.Adapters.SliderAdapter;
import com.example.akwad.R;

import java.util.ArrayList;
import java.util.List;

public class Home_frag extends Fragment implements Home_View {

     RecyclerView recyclerView,recyclerView1,recyclerView2;
     SliderAdapter adapter;
    BiggestCoupon_Adapter adapter1;
    MostClicked_Adapter adapter2;
     RecyclerView.LayoutManager layoutManager,layoutManager1,layoutManager2;
     private ArrayList<Slider>sliders;
     private ArrayList<Coupon> biggestCoupons;
     private ArrayList<Coupon> mostClicked;
     PresenterHome_frag presenterHome_frag;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_frag,container,false);
        recyclerView = view.findViewById(R.id.recy_sliders);
        recyclerView1 = view.findViewById(R.id.recy_biggestCoupon);
        recyclerView2 = view.findViewById(R.id.recy_most_clicked);


        set_Recycler();
         loadData();
        return view;
    }

    private void set_Recycler() {
        layoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,true);
        recyclerView.setLayoutManager(layoutManager);


        layoutManager1 = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,true);
        recyclerView1.setLayoutManager(layoutManager1);


        layoutManager2 = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,true);
        recyclerView2.setLayoutManager(layoutManager2);
    }

    private void loadData() {
        presenterHome_frag = new PresenterHome_frag(this);
        presenterHome_frag.getHome_frag_Data();


    }

    @Override
    public void onResponse(List<Slider> sliders) {


        this.sliders = new ArrayList<>();
        adapter = new SliderAdapter(sliders,getContext());
        recyclerView.setAdapter(adapter);
        this.sliders.addAll(sliders);
        adapter.notifyDataSetChanged();


    }

    @Override
    public void onFailure() {

        Toast.makeText(getContext(),"Failed",Toast.LENGTH_LONG).show();

    }

    @Override
    public void onResponse_BiggestCoupon(List<Coupon> biggestCoupons) {
       this.biggestCoupons = new ArrayList<>();
       adapter1 = new BiggestCoupon_Adapter(biggestCoupons,getContext());
       recyclerView1.setAdapter(adapter1);
       this.biggestCoupons.addAll(biggestCoupons);
       adapter1.notifyDataSetChanged();
    }

    @Override
    public void onResponse_MostClicked(List<Coupon> mostClicked) {
        this.mostClicked = new ArrayList<>();
        adapter2 = new MostClicked_Adapter(mostClicked,getContext());
        recyclerView2.setAdapter(adapter2);
        this.mostClicked.addAll(mostClicked);
        adapter2.notifyDataSetChanged();

    }
}
