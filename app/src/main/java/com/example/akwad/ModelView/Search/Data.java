package com.example.akwad.ModelView.Search;

import com.example.akwad.ModelView.CetagoryModel.Store;
import com.example.akwad.ModelView.DetailModel.Coupon;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data {

    @SerializedName("coupons")
    @Expose
    private List<com.example.akwad.ModelView.DetailModel.Coupon> coupons = null;
    @SerializedName("stores")
    @Expose
    private List<com.example.akwad.ModelView.CetagoryModel.Store> stores = null;

    public List<Coupon> getCoupons() {
        return coupons;
    }

    public void setCoupons(List<Coupon> coupons) {
        this.coupons = coupons;
    }

    public List<Store> getStores() {
        return stores;
    }

    public void setStores(List<Store> stores) {
        this.stores = stores;
    }
}
