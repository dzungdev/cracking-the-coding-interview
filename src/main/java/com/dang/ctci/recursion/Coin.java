package com.dang.ctci.recursion;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Coin {
  
  private int makeChange(int amount, int[] denoms, int denomIndex) {
    
    if (denomIndex >= denoms.length-1) return 1;
    int denomAmount = denoms[denomIndex];
    int ways = 0;
    for (int i = 0; i * denomAmount < amount; i++) {
      int remainingAmount = amount - i * denomAmount;
      ways += makeChange(remainingAmount, denoms, denomIndex + 1);
    }
    
    Map<String, Integer> map = null;
    List<String> results = map.keySet().stream().map(key -> map.get(key) + " " + key)
                                                    .collect(Collectors.toList());
    
    return ways;
  }
  
  public int makeChange(int amount) {
    int[] denoms = new int[] {25,10,5,1};
    return makeChange(amount, denoms, 0);
  }
  
}
