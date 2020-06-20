package com.example.akwad.Home_frag.UI;

import com.example.akwad.Home_frag.ModelView.Slider;

import java.util.List;

public interface Home_View {

    void onResponse(List<Slider>sliders);
    void onFailure();
}
