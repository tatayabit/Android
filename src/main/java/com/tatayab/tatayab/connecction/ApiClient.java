package com.tatayab.tatayab.connecction;

import com.tatayab.tatayab.Utils.Utils;

import java.io.IOException;

import okhttp3.Interceptor;


import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.tatayab.tatayab.Utils.Utils.AuthorizationKey;
import static com.tatayab.tatayab.Utils.Utils.BASE_URL;

public class ApiClient {
    private static Retrofit retrofit = null;



    public static Retrofit getClient() {



        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addNetworkInterceptor(new AddHeaderInterceptor());
        if (retrofit == null) {
            retrofit = new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create()).baseUrl(BASE_URL).client(httpClient.build()).build();

        }
        return retrofit;


    }

    public static class AddHeaderInterceptor implements Interceptor {
        @Override
        public Response intercept(Chain chain) throws IOException {

            Request.Builder builder = chain.request().newBuilder();
            builder.addHeader("Authorization", AuthorizationKey);

            return chain.proceed(builder.build());
        }
    }
}