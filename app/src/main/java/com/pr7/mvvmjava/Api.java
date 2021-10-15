package com.pr7.mvvmjava;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {


    @GET("posts")
    Call<List<Posts>> getPosts();
}
