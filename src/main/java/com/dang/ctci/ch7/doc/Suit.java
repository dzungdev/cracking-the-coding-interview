package com.dang.ctci.ch7.doc;

import java.util.HashMap;
import java.util.Map;

public enum Suit {
  
  Club(0), Diamon(1), Heart(2), Spade(3);
  
  private static final Map<Integer, Suit> suitMap = new HashMap<>();
  
  static {
    for (Suit s: Suit.values()) {
      suitMap.put(s.getValue(), s);
    }
  }
  
  private int value;
  private Suit(int value) { this.value = value;}
  public int getValue() {return value;};
  public static Suit getSuitByValue(int value) {
    return suitMap.get(value);
  }
  
}
