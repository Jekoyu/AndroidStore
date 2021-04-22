package com.jekoyu.retrofit2.retrofit;

import com.google.gson.internal.$Gson$Preconditions;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiService {
    private static final String BASE_URL = "http://192.168.10.81:45455/";
    private static Retrofit retrofit;
    public static ApiEndpoint apiEndpoint(){
        retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        return  retrofit.create(ApiEndpoint.class);
    }
}
