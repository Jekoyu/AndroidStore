package com.jekoyu.retrofit2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.jekoyu.retrofit2.retrofit.ApiEndpoint;
import com.jekoyu.retrofit2.retrofit.ApiService;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "Bagus";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getDataFromApi();
    }

    public void getDataFromApi(){
        ApiService.apiEndpoint().getUser().enqueue(new Callback<ArrayList<UserModel>>() {
            @Override
            public void onResponse(Call<ArrayList<UserModel>> call, Response<ArrayList<UserModel>> response) {
                if(response.isSuccessful()){
                    Log.d(TAG, "onResponse: "+response.body().toString());
                }
            }

            @Override
            public void onFailure(Call<ArrayList<UserModel>> call, Throwable t) {
                Log.d(TAG, "onFailure: "+t.toString() );
            }
        });
    }
}