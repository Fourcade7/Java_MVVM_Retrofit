package com.pr7.mvvmjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    PostViewModel postViewModel;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        postViewModel=new PostViewModel();

        postViewModel.liveData().observe(this, new Observer<List<Posts>>() {
            @Override
            public void onChanged(List<Posts> posts) {

                Log.d("Pr",posts.get(0).getTitle());


            }
        });




    }


}