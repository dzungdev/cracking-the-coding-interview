package com.dang.ctci.arr;

import java.util.ArrayList;
import java.util.List;

public class CheckPermutation {
  
  List<String> permutationStrings = new ArrayList<String>();

  private boolean isPermuation(String str1, String str2) {
    permute(str1, 0, str1.length() - 1);
    return permutationStrings.contains(str2);
  }

  private void permute(String str, int left, int right) {
    if (left == right) {
     permutationStrings.add(str);
    } else {
      for(int i = left; i <= right; i++) {
        str = swap(str, left, i);
        permute(str, left + 1, right);
      }
    }
  }
  
  public String swap(String a, int i, int j)
  {
      char temp;
      char[] charArray = a.toCharArray();
      temp = charArray[i] ;
      charArray[i] = charArray[j];
      charArray[j] = temp;
      return String.valueOf(charArray);
  }
  
  public static void main(String[] args) {
    String str1 = "ABC";
    String str2 = "DAC";
    CheckPermutation app = new CheckPermutation();
    System.out.println(app.isPermuation(str1, str2));
  }

}
