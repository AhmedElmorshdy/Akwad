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

import com.example.akwad.Home_frag.Adapters.BannerAdapter;
import com.example.akwad.Home_frag.Adapters.BiggestCoupon_Adapter;
import com.example.akwad.Home_frag.Adapters.MarketingAdapter;
import com.example.akwad.Home_frag.Adapters.MostClicked_Adapter;
import com.example.akwad.Home_frag.Adapters.RandomAdapter;
import com.example.akwad.Home_frag.Adapters.RecentAdapter;
import com.example.akwad.Home_frag.Adapters.ServiceAdapter;
import com.example.akwad.Home_frag.Presenter.PresenterHome_frag;
import com.example.akwad.ModelView.Coupon;
import com.example.akwad.ModelView.MarketingStore;
import com.example.akwad.ModelView.MidBanner;
import com.example.akwad.ModelView.ServicesStore;
import com.example.akwad.ModelView.Slider;
import com.example.akwad.Home_frag.Adapters.SliderAdapter;
import com.example.akwad.R;

import java.util.ArrayList;
import java.util.List;

public class Home_frag extends Fragment implements Home_View {

     RecyclerView recyclerView,recyclerView1,recyclerView2,recyclerView3,recyclerView4,recyclerView5,recyclerView6,recyclerView7;
     SliderAdapter adapter;
    BiggestCoupon_Adapter adapter1;
    MostClicked_Adapter adapter2;
    BannerAdapter adapter3;
    RecentAdapter adapter4;
     RandomAdapter adapter5;
     MarketingAdapter adapter6;
     ServiceAdapter adapter7;

     RecyclerView.LayoutManager layoutManager,layoutManager1,layoutManager2,layoutManager3,layoutManager4,layoutManager5,layoutManager6,layoutManager7;
     private ArrayList<Slider>sliders;
     private ArrayList<Coupon> biggestCoupons;
     private ArrayList<Coupon> mostClicked;
     private ArrayList<MidBanner>midBanners;
     private ArrayList<Coupon>recentcoupons;
     private ArrayList<Coupon>randomcoupons;
     private ArrayList<MarketingStore>marketingStores;
     private ArrayList<ServicesStore>servicesStores;
     PresenterHome_frag presenterHome_frag;
     View view;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         view = inflater.inflate(R.layout.home_frag,container,false);


         setView();
        set_Recycler();
         loadData();
        return view;
    }

    public void setView(){


        recyclerView = view.findViewById(R.id.recy_sliders);
        recyclerView1 = view.findViewById(R.id.recy_biggestCoupon);
        recyclerView2 = view.findViewById(R.id.recy_most_clicked);
        recyclerView3 = view.findViewById(R.id.recy_mid_Banner);
        recyclerView4 = view.findViewById(R.id.recy_orderd);
        recyclerView5 = view.findViewById(R.id.recy_random);
        recyclerView6 = view.findViewById(R.id.recy_maarketing);
        recyclerView7 = view.findViewById(R.id.recy_servicing);



    }

    private void set_Recycler() {
        layoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,true);
        recyclerView.setLayoutManager(layoutManager);


        layoutManager1 = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,true);
        recyclerView1.setLayoutManager(layoutManager1);


        layoutManager2 = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,true);
        recyclerView2.setLayoutManager(layoutManager2);


        layoutManager3 = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,true);
        recyclerView3.setLayoutManager(layoutManager3);

        layoutManager4 = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,true);
        recyclerView4.setLayoutManager(layoutManager4);


        layoutManager5= new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,true);
        recyclerView5.setLayoutManager(layoutManager5);


        layoutManager6= new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,true);
        recyclerView6.setLayoutManager(layoutManager6);



        layoutManager7= new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,true);
        recyclerView7.setLayoutManager(layoutManager7);
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

    @Override
    public void onResponse_MidBanners(List<MidBanner> midBanners) {
        this.midBanners = new ArrayList<>();
        adapter3 = new BannerAdapter(midBanners,getContext());
        recyclerView3.setAdapter(adapter3);
        this.midBanners.addAll(midBanners);
        adapter3.notifyDataSetChanged();


    }

    @Override
    public void onResponse_recentCoupons(List<Coupon> recentcoupons) {
        this.recentcoupons = new ArrayList<>();
        adapter4 = new RecentAdapter(recentcoupons,getContext());
        recyclerView4.setAdapter(adapter4);
        this.recentcoupons.addAll(recentcoupons);
        adapter4.notifyDataSetChanged();

    }

    @Override
    public void onResponse_randomCoupon(List<Coupon> randomcoupons) {
        this.randomcoupons =new ArrayList<>();
        adapter5 = new RandomAdapter(randomcoupons,getContext());
        recyclerView5.setAdapter(adapter5);
        this.randomcoupons.addAll(randomcoupons);
        adapter5.notifyDataSetChanged();


    }

    @Override
    public void onResponse_marketingStors(List<MarketingStore> marketingStores) {

        this.marketingStores = new ArrayList<>();
        adapter6 = new MarketingAdapter(marketingStores,getContext());
        recyclerView6.setAdapter(adapter6);
        this.marketingStores.addAll(marketingStores);
        adapter6.notifyDataSetChanged();

    }

    @Override
    public void onResponse_ServiceStores(List<ServicesStore> servicesStores) {
        this.servicesStores = new ArrayList<>();
        adapter7 = new ServiceAdapter(servicesStores,getContext());
        recyclerView7.setAdapter(adapter7);
        this.servicesStores.addAll(servicesStores);
        adapter7.notifyDataSetChanged();


    }
}
