package com.example.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

//    3. 会生成MainActivity_MembersInjector类
//    MainActivity_MembersInjector提供了赋值heater成员变量的方法
    @Inject
    ElectricHeater heater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerCoffeeShop.create().inject(this);
        heater.on();
        if(heater.isHot()){
            heater.off();
        }
    }
}
