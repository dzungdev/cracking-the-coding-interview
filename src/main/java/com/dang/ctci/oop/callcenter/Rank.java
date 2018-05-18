package com.dang.ctci.oop.callcenter;

import java.util.HashMap;
import java.util.Map;

public enum Rank {
  RESPONDENT(0), MANAGER(1), DIRECTOR(2);
  
  private static final Map<Integer, Rank> rankMap = new HashMap<>();
  
  static {
    for (Rank r: Rank.values()) {
      rankMap.put(r.getValue(), r);
    }
  }
  
  private int value;
  private Rank(int value) {this.value = value;}
  
  public int getValue() {return value;}
  public Rank getRankByValue(int value) { return rankMap.get(value);}
  
}
