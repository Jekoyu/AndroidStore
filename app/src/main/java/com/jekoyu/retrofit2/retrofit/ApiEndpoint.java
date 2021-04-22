package com.jekoyu.retrofit2.retrofit;

import com.jekoyu.retrofit2.UserModel;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiEndpoint {

    @GET("api/user")
    Call<ArrayList<UserModel>> getUser();


}
