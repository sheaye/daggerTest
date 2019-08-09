package com.sheaye.test;

class ElectricHeater implements Heater {
  boolean heating;

  public ElectricHeater() {
  }

  @Override public void on() {
    System.out.println("~ ~ ~ heating ~ ~ ~");
    this.heating = true;
  }

  @Override public void off() {
    this.heating = false;
  }

  @Override public boolean isHot() {
    return heating;
  }
}
