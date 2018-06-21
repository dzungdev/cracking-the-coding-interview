package com.dang.ctci.ch7.parkinglot;

public class Motorcycle extends Vehicle {

  public Motorcycle() {
    this.spotsNeeded = 1;
    size = VehicleSize.MOTORCYCLE;
  }

  @Override
  public boolean isFittedInSport(ParkingSpot spot) {
    return spot.isFitVehicle(this);
  }

}
