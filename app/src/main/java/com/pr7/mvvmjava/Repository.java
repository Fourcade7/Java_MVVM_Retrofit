package com.pr7.mvvmjava;

import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Repository {
    public MutableLiveData<List<Posts>> getPostLiveData(){

        MutableLiveData<List<Posts>> arrayListMutableLiveData=new MutableLiveData<>();

        Call<List<Posts>> call= (Call<List<Posts>>) RetrofitClient.getApi().getPosts();
        call.enqueue(new Callback<List<Posts>>() {
            @Override
            public void onResponse(Call<List<Posts>> call, Response<List<Posts>> response) {
                    if (response.isSuccessful()){
                        arrayListMutableLiveData.setValue(response.body());
                    }
            }

            @Override
            public void onFailure(Call<List<Posts>> call, Throwable t) {

            }
        });




        return arrayListMutableLiveData;



    }
}
