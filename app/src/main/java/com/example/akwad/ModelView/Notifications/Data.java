package com.example.akwad.ModelView.Notifications;

import com.example.akwad.ModelView.CetagoryModel.Paginate;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data {
    @SerializedName("notifications")
    @Expose
    private List<com.example.akwad.ModelView.Notifications.Notification> notifications = null;
    @SerializedName("paginate")
    @Expose
    private Paginate paginate;

    public List<Notification> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
    }

    public Paginate getPaginate() {
        return paginate;
    }

    public void setPaginate(Paginate paginate) {
        this.paginate = paginate;
    }

}
