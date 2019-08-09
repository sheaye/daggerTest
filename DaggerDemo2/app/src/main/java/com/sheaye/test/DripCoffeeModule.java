package com.sheaye.test;

import dagger.Module;
import dagger.Provides;

@Module
class DripCoffeeModule {
    @Provides
    Heater provideHeater() {
        return new ElectricHeater();
    }
}
