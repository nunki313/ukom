package com.smkrevit.pangkas_ku;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetLogin {
    @SerializedName("pesan")
    @Expose
    private String pesan;
    @SerializedName("data")
    @Expose
    private Login data;

    public String getPesan() {
        return pesan;
    }

    public void setPesan(String pesan) {
        this.pesan = pesan;
    }

    public Login getData() {
        return data;
    }

    public void setData(Login data) {
        this.data = data;
    }

}
