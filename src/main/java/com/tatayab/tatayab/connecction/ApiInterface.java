package com.tatayab.tatayab.connecction;

import com.tatayab.tatayab.model.LoginResponseParser;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;

import retrofit2.http.Headers;
import retrofit2.http.POST;



public interface ApiInterface {


    @Headers("Content-Type: application/json")

    @POST("TtmAuth")
    Call<LoginResponseParser> getLoginDetails(@Body Map<String, String> body);

}
