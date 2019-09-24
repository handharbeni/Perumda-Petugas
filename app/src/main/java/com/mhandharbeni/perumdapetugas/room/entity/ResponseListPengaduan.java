package com.mhandharbeni.perumdapetugas.room.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.mhandharbeni.perumda.room.entity.data.DataListPengaduan;

import java.util.List;

public class ResponseListPengaduan {
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("data")
    @Expose
    private List<DataListPengaduan> data = null;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<DataListPengaduan> getData() {
        return data;
    }

    public void setData(List<DataListPengaduan> data) {
        this.data = data;
    }
}
