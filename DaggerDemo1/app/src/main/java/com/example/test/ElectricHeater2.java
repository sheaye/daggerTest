package com.example.test;

import javax.inject.Inject;
import javax.inject.Singleton;

// 5. 添加@Singleton标注，并不会影响ElectricHeater2_Factory的结构
@Singleton
class ElectricHeater2 {
    boolean heating;

    @Inject
    public ElectricHeater2() {
    }

    public void on() {
        System.out.println("~ ~ ~ heating ~ ~ ~");
        this.heating = true;
    }

    public void off() {
        this.heating = false;
    }

    public boolean isHot() {
        return heating;
    }
}
