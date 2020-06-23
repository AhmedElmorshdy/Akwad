package com.example.akwad.ModelView.CetagoryModel;

import com.example.akwad.ModelView.MidBanner;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data {


    @SerializedName("mid_banner")
    @Expose
    private List<MidBanner> midBanner = null;
    @SerializedName("stores")
    @Expose
    private Stores stores;

    public List<MidBanner> getMidBanner() {
        return midBanner;
    }

    public void setMidBanner(List<MidBanner> midBanner) {
        this.midBanner = midBanner;
    }

    public Stores getStores() {
        return stores;
    }

    public void setStores(Stores stores) {
        this.stores = stores;
    }

}


