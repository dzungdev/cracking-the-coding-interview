package com.dang.ctci.ch7.parkinglot;

import java.util.HashMap;
import java.util.Map;

public enum VehicleSize {

  MOTORCYCLE(0), COMPACT(1), LARGE(2);
  private static final Map<Integer, VehicleSize> map = new HashMap<>();

  static {
    for (VehicleSize vs : VehicleSize.values()) {
      map.put(vs.value, vs);
    }
  }

  private int value;

  private VehicleSize(int value) {
    this.value = value;
  }

  public static VehicleSize getVehicleSize(int size) {
    return map.get(size);
  }

}
