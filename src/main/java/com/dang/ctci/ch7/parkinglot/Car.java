package com.dang.ctci.ch7.parkinglot;

public class Car extends Vehicle {

  public Car() {
    this.spotsNeeded = 1;
    size = VehicleSize.COMPACT;
  }

  @Override
  public boolean isFittedInSport(ParkingSpot spot) {
    return false;
  }
  
  
  
}
