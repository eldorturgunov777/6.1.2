package com.example.a612;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import timber.log.Timber;
import timber.log.Timber.DebugTree;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Timber.plant(new DebugTree());


    }
    @Override
    protected void onStart() {
        super.onStart();
        Timber.e("Start");
    }

    public void finish(View view) {
        finish();
        Timber.w("Close project");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Timber.d("Destroy");
    }
}