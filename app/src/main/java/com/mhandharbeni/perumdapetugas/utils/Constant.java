package com.mhandharbeni.perumdapetugas.utils;


import android.Manifest;

public class Constant {
    public static final int versionDb = 4;
    public static final String nameDb = "perumda.db";
    public static final String TAG = "PERUMDA USER";
    public static String BASE_URL = "https://api.pdamkabmalang.com/puslitbang/";
    public static String API_KEY = "bHl4YlhaZCtOUFQycnV4dUpPQ3lUamM4TStCTTZyVUxSRnpHaEIvWkhaMD0=";
    public static String TOKEN_FCM = "TOKEN_FCM";
    public static String TOKEN_PDAM = "TOKEN_PDAM";
    public static String PROFILE_NAMA_DEPAN = "NAMA_DEPAN";
    public static String PROFILE_NAMA_BELAKANG = "NAMA_BELAKANG";
    public static String PROFILE_EMAIL = "EMAIL";
    public static String PROFILE_PASSWORD = "PASSWORD";
    public static String PROFILE_TOKEN = "TOKEN";
    public static String PROFILE_NOSAL = "NOSAL";
    public static String PROFILE_NOHP = "NOHP";
    public static String PROFILE_ID = "ID";
    public static String PROFILE_ALAMAT = "ALAMAT";
    public static String PROFILE_IMAGE = "IMAGE";
    public static String IS_LOGGEDIN = "IS_LOGGEDIN";

    public static String LAST_LATITUDE = "LATITUDE";
    public static String LAST_LONGITUDE = "LONGITUDE";
//    public static String

    public static int RESPONSE_CODE = 200;

    public static String[] listPermission = new String[]{
            Manifest.permission.CAMERA,
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE,
            Manifest.permission.ACCESS_FINE_LOCATION,
            Manifest.permission.ACCESS_COARSE_LOCATION,
            Manifest.permission.ACCESS_NETWORK_STATE,
            Manifest.permission.INTERNET,
            Manifest.permission.CALL_PHONE
    };


    public static String DEFAULT_IMAGE_ACCOUNT = "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";
    public static String SERIALIZABLE_PENGADUAN = "DataPengaduan";
}