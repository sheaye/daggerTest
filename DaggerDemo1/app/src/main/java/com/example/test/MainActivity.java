package com.example.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    //    3. 会生成MainActivity_MembersInjector类
//    MainActivity_MembersInjector提供了赋值heater成员变量的方法
    @Inject
    ElectricHeater1 heater11;

    @Inject
    ElectricHeater1 heater12;

    @Inject
    ElectricHeater2 heater21;

    @Inject
    ElectricHeater2 heater22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerCoffeeShop.create().inject(this);
        String tag = getClass().getName();
        Log.e(tag, "heater11 ---> " + heater11.toString());
        Log.e(tag, "heater12 ---> " + heater12.toString());
        Log.e(tag, "heater21 ---> " + heater21.toString());
        Log.e(tag, "heater22 ---> " + heater22.toString());
        Log.e(tag, String.valueOf(heater11.equals(heater12)));
        Log.e(tag, String.valueOf(heater21.equals(heater22)));
    }
}
