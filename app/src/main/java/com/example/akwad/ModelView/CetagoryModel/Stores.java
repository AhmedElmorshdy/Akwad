package com.example.akwad.ModelView.CetagoryModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Stores {

    @SerializedName("stores")
    @Expose
    private List<Store> stores = null;
    @SerializedName("paginate")
    @Expose
    private Paginate paginate;

    public List<Store> getStores() {
        return stores;
    }

    public void setStores(List<Store> stores) {
        this.stores = stores;
    }

    public Paginate getPaginate() {
        return paginate;
    }

    public void setPaginate(Paginate paginate) {
        this.paginate = paginate;
    }

}
