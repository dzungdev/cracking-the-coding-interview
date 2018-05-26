package com.dang.ctci.oop.parkinglot;

public class ParkingSpot {
  
  private Vehicle vehicle;
  private VehicleSize spotSize;
  private int row;
  private int spotNumber;
  private Level level;
  
  public ParkingSpot(Level level, int row, int spotNumber, VehicleSize vehicleSize) {
    this.level = level;
    this.row = row;
    this.spotNumber = spotNumber;
    this.spotSize = vehicleSize;
  }
  
  public boolean isAvailable() { return vehicle == null; }
  
  public boolean isFitVehicle(Vehicle vehicle) {return vehicle.size == spotSize;}
  
  public void park(Vehicle vehicle) {
    this.vehicle = vehicle;
    this.level.reduceAvailableSpots();
  }
  
  public void freeSpot() {
    this.vehicle = null;
    this.level.incrementAvailableSpots();
  }

  public int getRow() {
    return row;
  }

  public void setRow(int row) {
    this.row = row;
  }

  public int getSpotNumber() {
    return spotNumber;
  }

  public void setSpotNumber(int spotNumber) {
    this.spotNumber = spotNumber;
  }

  public Level getLevel() {
    return level;
  }

  public void setLevel(Level level) {
    this.level = level;
  }

  public Vehicle getVehicle() {
    return vehicle;
  }

  public void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }
  
}
