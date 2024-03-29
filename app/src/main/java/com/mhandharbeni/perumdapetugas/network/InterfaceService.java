package com.mhandharbeni.perumdapetugas.network;

import com.mhandharbeni.perumdapetugas.network.model.GeneralResponse;
import com.mhandharbeni.perumdapetugas.room.entity.ResponseGangguan;
import com.mhandharbeni.perumdapetugas.room.entity.ResponseImageSlider;
import com.mhandharbeni.perumdapetugas.room.entity.ResponseListPengaduan;
import com.mhandharbeni.perumdapetugas.room.entity.ResponseLogin;
import com.mhandharbeni.perumdapetugas.room.entity.ResponseLoket;
import com.mhandharbeni.perumdapetugas.room.entity.ResponsePasangBaru;
import com.mhandharbeni.perumdapetugas.room.entity.ResponsePengaduan;
import com.mhandharbeni.perumdapetugas.room.entity.ResponseProfile;
import com.mhandharbeni.perumdapetugas.room.entity.ResponseProgressPengaduan;
import com.mhandharbeni.perumdapetugas.room.entity.ResponseRegister;
import com.mhandharbeni.perumdapetugas.room.entity.ResponseRekening;
import com.mhandharbeni.perumdapetugas.room.entity.ResponseSopp;
import com.mhandharbeni.perumdapetugas.room.entity.ResponseToken;
import com.mhandharbeni.perumdapetugas.room.entity.ResponseUnit;
import com.mhandharbeni.perumdapetugas.room.entity.ResponseUpdateProfile;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface InterfaceService {
    @FormUrlEncoded
    @POST("pelanggan/ctoken")
    Call<ResponseToken> cToken(
            @Field("device_id") String device_id
    );

    @FormUrlEncoded
    @POST("pelanggan/login")
    Call<ResponseLogin> login(
            @Field("nohandphone") String nohandphone,
            @Field("password") String password
    );

    @FormUrlEncoded
    @POST("pelanggan/register")
    Call<ResponseRegister> register(
            @Field("namadepan") String namadepan,
            @Field("namabelakang") String namabelakang,
            @Field("nohandphone") String nohandphone,
            @Field("alamat") String alamat,
            @Field("email") String email,
            @Field("password") String password,
            @Field("device_id") String device_id,
            @Field("token_fcm") String token_fcm
    );

    @FormUrlEncoded
    @POST("pelanggan/updregister")
    Call<ResponseUpdateProfile> updateProfile(
            @Field("token") String token,
            @Field("nohandphone") String nohandphone,
            @Field("nosal") String nosal,
            @Field("namadepan") String namadepan,
            @Field("namabelakang") String namabelakang,
            @Field("password") String password,
            @Field("alamat") String alamat,
            @Field("image") String image
    );

    @FormUrlEncoded
    @POST("pelanggan/getProfile")
    Call<ResponseProfile> getProfile(
            @Field("token") String token,
            @Field("nohandphone") String nohandphone
    );

    @FormUrlEncoded
    @POST("pelanggan/rekening")
    Call<ResponseRekening> getInfoRekening(
            @Field("token") String token,
            @Field("nohandphone") String nohandphone,
            @Field("nosal") String nosal
    );

    @FormUrlEncoded
    @POST("pelanggan/sopp")
    Call<ResponseSopp> getTagihan(
            @Field("token") String token,
            @Field("nohandphone") String nohandphone,
            @Field("nosal") String nosal
    );

    @FormUrlEncoded
    @POST("pelanggan/getunit")
    Call<ResponseUnit> getUnit(
            @Field("token") String token,
            @Field("nohandphone") String nohandphone
    );

    @FormUrlEncoded
    @POST("pelanggan/getloket")
    Call<ResponseLoket> getLoket(
            @Field("token") String token,
            @Field("nohandphone") String nohandphone
    );

    @FormUrlEncoded
    @POST("pelanggan/getdatapengaduan")
    Call<ResponsePengaduan> getDataPengaduan(
            @Field("token") String token,
            @Field("nohandphone") String nohandphone,
            @Field("nopengaduan") String nopengaduan
    );

    @FormUrlEncoded
    @POST("pelanggan/getlistpengaduan")
    Call<ResponseListPengaduan> getListPengaduan(
            @Field("token") String token,
            @Field("nohandphone") String nohandphone
    );

    @FormUrlEncoded
    @POST("pelanggan/getprogresspengaduan")
    Call<ResponseProgressPengaduan> getProgressPengaduan(
            @Field("token") String token,
            @Field("nohandphone") String nohandphone,
            @Field("nopengaduan") String nopengaduan
    );

    @FormUrlEncoded
    @POST("pelanggan/pengaduan")
    Call<GeneralResponse> postPengaduan(
            @Field("token") String token,
            @Field("nohandphone") String nohandphone,
            @Field("nosal") String nosal,
            @Field("nama") String nama,
            @Field("alamat") String alamat,
            @Field("jnsaduan") String jnsaduan,
            @Field("isiaduan") String isiaduan,
            @Field("unitlayanan") String unitlayanan,
            @Field("foto1") String foto1,
            @Field("gps1") String gps1
    );

    @FormUrlEncoded
    @POST("pelanggan/pasangbaru")
    Call<ResponsePasangBaru> postPasangBaru(
            @Field("nama") String nama,
            @Field("alamat") String alamat,
            @Field("noktp") String noktp,
            @Field("nohandphone") String nohandphone,
            @Field("lokasipasang") String lokasipasang,
            @Field("fotoktp") String fotoktp,
            @Field("token") String token
    );

    @FormUrlEncoded
    @POST("pelanggan/getgangguan")
    Call<ResponseGangguan> getGangguan(
            @Field("token") String token
    );

    @FormUrlEncoded
    @POST("pelanggan/getsplash")
    Call<ResponseImageSlider> getImageSlider(
            @Field("dummyparams") String params
    );

    @FormUrlEncoded
    @POST("pelanggan/getlistpasangbaru")
    Call<ResponsePasangBaru> getListPasangBaru(
            @Field("token") String token,
            @Field("nohandphone") String nohandphone
    );
}
