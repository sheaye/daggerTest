package com.example.test;

import javax.inject.Singleton;

import dagger.Component;

// 1. @Component会生成一个CoffeeShop的实现类，内置Builder，DaggerCoffeeShop
@Component
@Singleton
public interface CoffeeShop {
//    4. 会在DaggerCoffeeShop中生成injectMainActivity()方法
//    injectMainActivity()方法中会调用MainActivity_MembersInjector的injectHeater方法注入成员变量实例
    void inject(MainActivity mainActivity);
}
