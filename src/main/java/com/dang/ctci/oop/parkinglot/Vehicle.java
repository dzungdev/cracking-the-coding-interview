package com.dang.ctci.oop.parkinglot;

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
    parkingSpots.add(s);
    //TODO:need to add the vehicle to spot to
    //reduce the available spot number in Level
  }
  
  public void leave() {
    parkingSpots.clear();
    //TODO: increment spot size in Level
  }
  
  public abstract boolean isFittedInSport(ParkingSpot spot);
  
}
