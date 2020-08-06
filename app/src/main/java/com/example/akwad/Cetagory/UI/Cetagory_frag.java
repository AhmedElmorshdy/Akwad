package com.example.akwad.Cetagory.UI;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.akwad.Cetagory.Adapters.CetagoryAdapterSlide;
import com.example.akwad.Cetagory.Adapters.CetagoryItemAdapter;
import com.example.akwad.Cetagory.Adapters.CetagoryMidBannerAdapter;

import com.example.akwad.Cetagory.Presenter.CetagoryPresenter;

import com.example.akwad.activity_main2;
import com.example.akwad.ModelView.CetagoryModel.Store;
import com.example.akwad.ModelView.MidBanner;
import com.example.akwad.ModelView.Slider;
import com.example.akwad.R;

import java.util.ArrayList;
import java.util.List;

public class Cetagory_frag extends Fragment implements Cetagory_view {

    RecyclerView recyclerView, recyclerView2, recyclerView3;
    CetagoryAdapterSlide adapter;
    CetagoryItemAdapter adapter1;
    CetagoryMidBannerAdapter adapter3;
    private ArrayList<Slider> sliders;
    private ArrayList<Store> stores;
    private ArrayList<MidBanner> midBanners;
    RecyclerView.LayoutManager layoutManager, layoutManager2, layoutManager3;
    CetagoryPresenter cetagoryPresenter;
    View view;
    Bundle bundle;
    int i;
    String id;
    int id1;

    Store store;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.cetagory_frag, container, false);
        setView();
        grtID();
        setRecyclerView();
        loadData();
        return view;
    }

    public void setView() {

        recyclerView = view.findViewById(R.id.recy_cetagoryBanners);
        recyclerView2 = view.findViewById(R.id.recy_cetagoryitems);
        recyclerView3 = view.findViewById(R.id.recy_cetagory_midBanner);


    }


    public void setRecyclerView() {

        layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, true);
        recyclerView.setLayoutManager(layoutManager);

        layoutManager2 = new GridLayoutManager(getContext(), 3);
        recyclerView2.setLayoutManager(layoutManager2);


        layoutManager3 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, true);
        recyclerView3.setLayoutManager(layoutManager3);


    }

    public void loadData() {

        cetagoryPresenter = new CetagoryPresenter(this);
        cetagoryPresenter.getHome_frag_Data();
        cetagoryPresenter.getCetagory(i);


    }

    public void grtID() {

        bundle = this.getArguments();
        i = bundle.getInt("id");
    }


    @Override
    public void onResponse_CetagorySliders(List<Slider> sliders) {
        this.sliders = new ArrayList<>();
        adapter = new CetagoryAdapterSlide(sliders, getContext());
        recyclerView.setAdapter(adapter);
        this.sliders.addAll(sliders);
        adapter.notifyDataSetChanged();


    }

    @Override
    public void onResponse_CetagoryItems(List<Store> stores) {
        this.stores = new ArrayList<>();
        adapter1 = new CetagoryItemAdapter(stores, getContext());
        recyclerView2.setAdapter(adapter1);
        this.stores.addAll(stores);
        adapter1.notifyDataSetChanged();
        getDetails();



    }

    @Override
    public void onResponse_CetagoryMidBanner(List<MidBanner> midBanners) {
        this.midBanners = new ArrayList<>();
        adapter3 = new CetagoryMidBannerAdapter(midBanners, getContext());
        recyclerView3.setAdapter(adapter3);
        this.midBanners.addAll(midBanners);
        adapter3.notifyDataSetChanged();
    }

    public void getDetails(){

        adapter1.setOnItemClickListener(new CetagoryItemAdapter.OnItemClickListener() {
            @Override
            public void OnItemClick(int position) {



                Intent intent = new Intent(getContext(), activity_main2.class);

                intent.putExtra("id1",stores.get(position).getId());
                startActivity(intent);
            }
        });


    }




}
