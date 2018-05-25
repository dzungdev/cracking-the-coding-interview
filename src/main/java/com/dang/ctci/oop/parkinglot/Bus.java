package com.dang.ctci.oop.parkinglot;

public class Bus extends Vehicle {
  
  public Bus() {
    spotsNeeded = 5;
    size = VehicleSize.LARGE;
  }

  @Override
  public boolean isFittedInSport(ParkingSpot spot) {
    return spot.isFitVehicle(this);
  }

}
