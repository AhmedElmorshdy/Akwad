package com.example.akwad.Cetagory.UI;

import com.example.akwad.ModelView.CetagoryModel.Store;
import com.example.akwad.ModelView.MidBanner;
import com.example.akwad.ModelView.Slider;

import java.util.List;

public interface Cetagory_view {
    void onResponse_CetagorySliders(List<Slider>sliders);
    void onResponse_CetagoryItems(List<Store>stores);
    void onResponse_CetagoryMidBanner(List<MidBanner>midBanners);

}
