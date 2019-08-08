package com.example.test;

import javax.inject.Inject;

class ElectricHeater {
    boolean heating;

    // 2. 生成一个生产ElectricHeater实例的工厂类单例ElectricHeater_Factory
    @Inject
    public ElectricHeater() {
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
