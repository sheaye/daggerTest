package com.example.test;

import javax.inject.Inject;

class ElectricHeater1 {
    boolean heating;

    // 2. 生成一个生产ElectricHeater实例的工厂类单例ElectricHeater_Factory
    @Inject
    public ElectricHeater1() {
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
