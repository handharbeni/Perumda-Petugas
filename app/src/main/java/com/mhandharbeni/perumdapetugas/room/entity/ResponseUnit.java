package com.mhandharbeni.perumdapetugas.room.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.mhandharbeni.perumda.room.entity.data.DataUnit;

import java.util.List;

public class ResponseUnit {
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("data")
    @Expose
    private List<DataUnit> data = null;

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

    public List<DataUnit> getData() {
        return data;
    }

    public void setData(List<DataUnit> data) {
        this.data = data;
    }
}
