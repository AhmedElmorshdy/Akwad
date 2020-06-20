package com.example.akwad.Home_frag.ModelView;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data {

    @SerializedName("sliders")
    @Expose
    private List<Slider> sliders = null;
    @SerializedName("biggest_coupon")
    @Expose
    private List<Object> biggestCoupon = null;
    @SerializedName("most_clicked")
    @Expose
    private List<Object> mostClicked = null;
    @SerializedName("mid_banner")
    @Expose
    private List<MidBanner> midBanner = null;
    @SerializedName("recent_coupons")
    @Expose
    private List<Object> recentCoupons = null;
    @SerializedName("random_coupons")
    @Expose
    private List<Object> randomCoupons = null;
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

    public List<Object> getBiggestCoupon() {
        return biggestCoupon;
    }

    public void setBiggestCoupon(List<Object> biggestCoupon) {
        this.biggestCoupon = biggestCoupon;
    }

    public List<Object> getMostClicked() {
        return mostClicked;
    }

    public void setMostClicked(List<Object> mostClicked) {
        this.mostClicked = mostClicked;
    }

    public List<MidBanner> getMidBanner() {
        return midBanner;
    }

    public void setMidBanner(List<MidBanner> midBanner) {
        this.midBanner = midBanner;
    }

    public List<Object> getRecentCoupons() {
        return recentCoupons;
    }

    public void setRecentCoupons(List<Object> recentCoupons) {
        this.recentCoupons = recentCoupons;
    }

    public List<Object> getRandomCoupons() {
        return randomCoupons;
    }

    public void setRandomCoupons(List<Object> randomCoupons) {
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
