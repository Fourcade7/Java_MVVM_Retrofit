package com.pr7.mvvmjava;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class PostViewModel extends ViewModel {


    Repository repository;
    MutableLiveData<List<Posts>> getpostdata;

    public PostViewModel(){


        repository=new Repository();

    }

    public LiveData<List<Posts>> liveData(){
            if (getpostdata==null){
                getpostdata=repository.getPostLiveData();
            }

        return getpostdata;
    }
}
