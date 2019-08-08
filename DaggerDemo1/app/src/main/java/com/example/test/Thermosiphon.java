package com.example.test;

import javax.inject.Inject;
import javax.inject.Singleton;


@Singleton
class Thermosiphon {
    private final ElectricHeater heater;

    @Inject
    Thermosiphon(ElectricHeater heater) {
        this.heater = heater;
    }

    public void pump() {
        if (heater.isHot()) {
            System.out.println("=> => pumping => =>");
        }
    }
}
