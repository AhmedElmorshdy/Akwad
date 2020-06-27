package com.example.akwad.Cetagory.Details.UI.UI;

import com.example.akwad.ModelView.DetailModel.Coupon;
import com.example.akwad.ModelView.DetailModel.StoreData;

import java.util.List;

public interface View_Cetagory {
    void onResponseDetails(StoreData storeData);
    void onResponselistcoupon(List<Coupon>coupons);
}
