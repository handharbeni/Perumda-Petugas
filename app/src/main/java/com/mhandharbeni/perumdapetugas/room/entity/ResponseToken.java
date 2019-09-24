package com.mhandharbeni.perumdapetugas.room.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.mhandharbeni.perumda.room.entity.data.DataToken;

public class ResponseToken {
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("data")
    @Expose
    private DataToken data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() { return message; }

    public void setMessage(String message) { this.message = message; }

    public DataToken getData() {
        return data;
    }

    public void setData(DataToken data) {
        this.data = data;
    }
}
