package com.sheaye.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Pump mPump;

    @Inject
    Heater mHeater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String tag = getClass().getName();
//        Log.e(tag, mHeater.toString());
//        Log.e(tag, mPump.toString());
    }
}
