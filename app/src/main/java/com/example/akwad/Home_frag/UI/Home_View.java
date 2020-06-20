package com.example.akwad.Home_frag.UI;

import com.example.akwad.ModelView.Coupon;
import com.example.akwad.ModelView.Slider;

import java.util.List;

public interface Home_View {

    void onResponse(List<Slider>sliders);
    void onFailure();
    void onResponse_BiggestCoupon(List<Coupon>biggestCoupons);
    void onResponse_MostClicked(List<Coupon>mostClicked);
}
