package com.example.akwad.ModelView.Search;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SearchResponse {


    @SerializedName("value")
    @Expose
    private Boolean value;
    @SerializedName("data")
    @Expose
    private Data data;
    @SerializedName("comment")
    @Expose
    private String comment;

    public Boolean getValue() {
        return value;
    }

    public void setValue(Boolean value) {
        this.value = value;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}
