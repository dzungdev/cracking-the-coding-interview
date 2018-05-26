package com.dang.ctci.oop.parkinglot;

import java.util.ArrayList;
import java.util.List;

public class Level {
  
  private int floor;
  private ParkingSpot[] spots;
  private int availableSpots = 0;
  private static final int SPOTS_PER_ROW = 10;
  
  
  public Level(int floor, int numberSpots) {
    this.floor = floor;
    spots = new ParkingSpot[numberSpots];
  }
  
  public int availableSpots() { return availableSpots; }
  
  //TODO: need to do the logic here
  public boolean parkVehicle(Vehicle vehicle) {
    int spotStartIndex = findAvailableSpots(vehicle);
    if (spotStartIndex != -1) {
      parkStartingAtSpot(spotStartIndex, vehicle);
      return true;
    }
    return false;
  }
  
  private boolean parkStartingAtSpot(int num, Vehicle v) {
    int endSpot = num + v.getSpotsNeeded();
    for (int i = num; i < endSpot;i++) {
      spots[i].park(v);
    }
    return true;
  }
  
  private int findAvailableSpots(Vehicle vehicle) {
    if (vehicle.getSpotsNeeded() == 5) {
      for (int i = 0; i <= spots.length - 5; i++) {
        if (spots[i].isAvailable() && spots[i].isFitVehicle(vehicle) && 
            spots[i+1].isAvailable() && spots[i+1].isFitVehicle(vehicle) &&  
            spots[i+2].isAvailable() && spots[i+2].isFitVehicle(vehicle) &&
            spots[i+3].isAvailable() && spots[i+3].isFitVehicle(vehicle) &&
            spots[i+4].isAvailable() &&  spots[i+4].isFitVehicle(vehicle)) {
          return i;
        }
      }
    } else {
      for (int i = 0; i < spots.length; i++) {
        if (spots[i].isAvailable() && spots[i].isFitVehicle(vehicle)) {
          return i;
        }
      }
    }
    return -1;
  }
  
  public void incrementAvailableSpots() { availableSpots++; }
  public void reduceAvailableSpots() {availableSpots--;}
  
}
