package com.dang.ctci.ch7.parkinglot;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {
  
  protected List<ParkingSpot> parkingSpots = new ArrayList<>();
  protected String licensePlate;
  protected int spotsNeeded;
  protected VehicleSize size;
  
  public VehicleSize getSize() {return size;}
  public int getSpotsNeeded() {return spotsNeeded;}
  
  public void park(ParkingSpot s) {
    s.park(this);
    parkingSpots.add(s);
  }
  
  public void leave() {
    for (ParkingSpot spot: parkingSpots) {
      spot.freeSpot();
    }
    parkingSpots.clear();
  }
  
  public abstract boolean isFittedInSport(ParkingSpot spot);
  
}
