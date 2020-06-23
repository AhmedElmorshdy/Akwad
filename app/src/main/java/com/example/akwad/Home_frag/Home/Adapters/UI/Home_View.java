package com.example.akwad.Home_frag.Home.Adapters.UI;

import com.example.akwad.ModelView.Coupon;
import com.example.akwad.ModelView.MarketingStore;
import com.example.akwad.ModelView.MidBanner;
import com.example.akwad.ModelView.ServicesStore;
import com.example.akwad.ModelView.Slider;

import java.util.List;

public interface Home_View {

    void onResponse(List<Slider>sliders);
    void onFailure();
    void onResponse_BiggestCoupon(List<Coupon>biggestCoupons);
    void onResponse_MostClicked(List<Coupon>mostClicked);
    void onResponse_MidBanners(List<MidBanner>midBanners);
    void onResponse_recentCoupons(List<Coupon>recentcoupons);
    void onResponse_randomCoupon(List<Coupon>randomcoupons);
    void onResponse_marketingStors(List<MarketingStore>marketingStores);
    void onResponse_ServiceStores(List<ServicesStore>servicesStores);
}
