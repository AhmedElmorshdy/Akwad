package com.example.akwad.ModelView.Home_frag;

import com.example.akwad.ModelView.Coupon;
import com.example.akwad.ModelView.MarketingStore;
import com.example.akwad.ModelView.MidBanner;
import com.example.akwad.ModelView.ServicesStore;
import com.example.akwad.ModelView.Slider;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data {

    @SerializedName("sliders")
    @Expose
    private List<Slider> sliders = null;
    @SerializedName("biggest_coupon")
    @Expose
    private List<Coupon> biggestCoupon = null;
    @SerializedName("most_clicked")
    @Expose
    private List<Coupon> mostClicked = null;
    @SerializedName("mid_banner")
    @Expose
    private List<MidBanner> midBanner = null;
    @SerializedName("recent_coupons")
    @Expose
    private List<Coupon> recentCoupons = null;
    @SerializedName("random_coupons")
    @Expose
    private List<Coupon> randomCoupons = null;
    @SerializedName("marketing_stores")
    @Expose
    private List<MarketingStore> marketingStores = null;
    @SerializedName("services_stores")
    @Expose
    private List<ServicesStore> servicesStores = null;
    @SerializedName("travelling_stores")
    @Expose
    private List<Object> travellingStores = null;

    public List<Slider> getSliders() {
        return sliders;
    }

    public void setSliders(List<Slider> sliders) {
        this.sliders = sliders;
    }

    public List<Coupon> getBiggestCoupon() {
        return biggestCoupon;
    }

    public void setBiggestCoupon(List<Coupon> biggestCoupon) {
        this.biggestCoupon = biggestCoupon;
    }

    public List<Coupon> getMostClicked() {
        return mostClicked;
    }

    public void setMostClicked(List<Coupon> mostClicked) {
        this.mostClicked = mostClicked;
    }

    public List<MidBanner> getMidBanner() {
        return midBanner;
    }

    public void setMidBanner(List<MidBanner> midBanner) {
        this.midBanner = midBanner;
    }

    public List<Coupon> getRecentCoupons() {
        return recentCoupons;
    }

    public void setRecentCoupons(List<Coupon> recentCoupons) {
        this.recentCoupons = recentCoupons;
    }

    public List<Coupon> getRandomCoupons() {
        return randomCoupons;
    }

    public void setRandomCoupons(List<Coupon> randomCoupons) {
        this.randomCoupons = randomCoupons;
    }

    public List<MarketingStore> getMarketingStores() {
        return marketingStores;
    }

    public void setMarketingStores(List<MarketingStore> marketingStores) {
        this.marketingStores = marketingStores;
    }

    public List<ServicesStore> getServicesStores() {
        return servicesStores;
    }

    public void setServicesStores(List<ServicesStore> servicesStores) {
        this.servicesStores = servicesStores;
    }

    public List<Object> getTravellingStores() {
        return travellingStores;
    }

    public void setTravellingStores(List<Object> travellingStores) {
        this.travellingStores = travellingStores;
    }
}
