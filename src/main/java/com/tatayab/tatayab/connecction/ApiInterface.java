package com.tatayab.tatayab.connecction;

import com.tatayab.tatayab.model.BannerResponseParser;
import com.tatayab.tatayab.model.FeaturedProductResponseParser;
import com.tatayab.tatayab.model.LoginResponseParser;
import com.tatayab.tatayab.model.MainCategoryListResponseParser;
import com.tatayab.tatayab.model.SignUpResponseParser;
import com.tatayab.tatayab.model.TrendingResponseParser;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;

import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;


public interface ApiInterface {


    @Headers("Content-Type: application/json")
    @POST("TtmAuth")
    Call<LoginResponseParser> getLoginDetails(@Body Map<String, String> body);


    @Headers("Content-Type: application/json")
    @POST("users")
    Call<SignUpResponseParser> SignUpnNewUsers(@Body Map<String, Object> body);


    @Headers("Content-Type: application/json")
    @GET("TtmBlocks/312")
    Call<BannerResponseParser>  getHeaderBanners();


    @Headers("Content-Type: application/json")
    @GET("TtmCategories")
    Call<MainCategoryListResponseParser>  getMainCategoriesList();

    @Headers("Content-Type: application/json")
    @GET("TtmBlocks/269")
    Call<TrendingResponseParser>  getTrendingList();

    @Headers("Content-Type: application/json")
    @GET("TtmBlocks/268")
    Call<FeaturedProductResponseParser>  getFeaturedList();

}
