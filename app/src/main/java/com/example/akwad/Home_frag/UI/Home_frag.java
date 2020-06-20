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

import com.example.akwad.Home_frag.Presenter.PresenterHome_frag;
import com.example.akwad.Home_frag.ModelView.Slider;
import com.example.akwad.Home_frag.Slider_recy.SliderAdapter;
import com.example.akwad.R;

import java.util.ArrayList;
import java.util.List;

public class Home_frag extends Fragment implements Home_View {

     RecyclerView recyclerView;
     SliderAdapter adapter;
     RecyclerView.LayoutManager layoutManager;
     private ArrayList<Slider>sliders;
     PresenterHome_frag presenterHome_frag;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_frag,container,false);
        recyclerView = view.findViewById(R.id.recy_sliders);
        set_Recycler();
         loadData();
        return view;
    }

    private void set_Recycler() {
        layoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,true);
        recyclerView.setLayoutManager(layoutManager);
    }
    private void loadData() {
        presenterHome_frag = new PresenterHome_frag(this);
        presenterHome_frag.getSliders();

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
}
