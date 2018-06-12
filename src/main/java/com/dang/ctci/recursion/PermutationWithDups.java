package com.dang.ctci.recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PermutationWithDups {
  
  Map<Character, Integer> createFreqTable(String s) {
    Map<Character, Integer> map = new HashMap<>();
    for (char c: s.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }
    return map;
  }
  
  public void printPerms(Map<Character, Integer> map, String prefix, int remaining, List<String> result) {
    if (remaining == 0) {
      result.add(prefix);
      return;
    }
    for (Character c: map.keySet()) {
      int count = map.get(c);
      if (count > 0) {
        map.put(c, count - 1);
        printPerms(map, prefix + c, remaining - 1, result);
        map.put(c, count + 1);
      }
    }
  }
  
  List<String> printPerms(String s) {
    Map<Character, Integer> freqMap = createFreqTable(s);
    List<String> result = new ArrayList<>();
    printPerms(freqMap, "", s.length(), result);
    return result;
  }
  
  public static void main(String[] args) {
    PermutationWithDups app = new PermutationWithDups();
    
  }
  
}
