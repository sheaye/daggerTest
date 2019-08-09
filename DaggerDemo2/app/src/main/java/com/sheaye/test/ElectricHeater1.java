package com.sheaye.test;

class ElectricHeater1 implements Heater {
  boolean heating;

  public ElectricHeater1() {
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
