package com.example.james.parrot;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.james.parrot.app.ParrotApplication;

import org.opencv.android.OpenCVLoader;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject Resources resources; // Reference get injected.

    private static final String TAG = "MainActivity";

    static {
        if(!OpenCVLoader.initDebug()){
            Log.d(TAG, "OpenCV not loaded");
        } else {
            Log.d(TAG, "OpenCV loaded");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Injecting dependencies with Dagger 2.
        ((ParrotApplication) getApplication()).getComponent().inject(this);
    }
}
