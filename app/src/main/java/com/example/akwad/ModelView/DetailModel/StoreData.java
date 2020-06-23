package com.example.akwad.ModelView.DetailModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StoreData {

    @SerializedName("store_name")
    @Expose
    private String storeName;
    @SerializedName("store_description")
    @Expose
    private String storeDescription;
    @SerializedName("store_logo")
    @Expose
    private String storeLogo;
    @SerializedName("website")
    @Expose
    private String website;
    @SerializedName("android")
    @Expose
    private String android;
    @SerializedName("ios")
    @Expose
    private String ios;

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreDescription() {
        return storeDescription;
    }

    public void setStoreDescription(String storeDescription) {
        this.storeDescription = storeDescription;
    }

    public String getStoreLogo() {
        return storeLogo;
    }

    public void setStoreLogo(String storeLogo) {
        this.storeLogo = storeLogo;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getAndroid() {
        return android;
    }

    public void setAndroid(String android) {
        this.android = android;
    }

    public String getIos() {
        return ios;
    }

    public void setIos(String ios) {
        this.ios = ios;
    }
}
