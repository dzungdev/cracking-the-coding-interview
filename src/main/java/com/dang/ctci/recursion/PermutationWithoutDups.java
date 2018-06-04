package com.dang.ctci.recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationWithoutDups {
  
  public List<String> getPermutations(String remainder) {
    List<String> result = new ArrayList<>();
    int len = remainder.length();
    if (len == 0) {
      result.add("");
      return result;
    }
    
    for (int i = 0; i < len; i++) {
      String before = remainder.substring(0, i);
      String after = remainder.substring(i+1, len);
      List<String> partials = getPermutations(before + after);
      for (String subPermuationStr: partials) {
        result.add(remainder.charAt(i) + subPermuationStr);
      }
    }
    return result;
  }
  
}
