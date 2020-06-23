package com.example.akwad.ModelView.DetailModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data {


    @SerializedName("store_data")
    @Expose
    private StoreData storeData;
    @SerializedName("coupons")
    @Expose
    private List<Object> coupons = null;
    @SerializedName("paginate")
    @Expose
    private Paginate paginate;

    public StoreData getStoreData() {
        return storeData;
    }

    public void setStoreData(StoreData storeData) {
        this.storeData = storeData;
    }

    public List<Object> getCoupons() {
        return coupons;
    }

    public void setCoupons(List<Object> coupons) {
        this.coupons = coupons;
    }

    public Paginate getPaginate() {
        return paginate;
    }

    public void setPaginate(Paginate paginate) {
        this.paginate = paginate;
    }
}
