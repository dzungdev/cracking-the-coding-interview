package com.dang.ctci.arr;

public class IsUnique {
  
  public boolean isUnique(String str) {
    char[] chars = str.toCharArray();
    int[] charsCount = new int[256];
    for(int i = 0; i < 256; i++) {
      charsCount[i] = 0;
    }
    for (char c: chars) {
      if (charsCount[c] > 0) return false;
      charsCount[c]++;
    }
    return true;
  }
  
  public static void main(String[] args) {
    String str = "abca";
    IsUnique app = new IsUnique();
    System.out.println(app.isUnique(str));
  }
  
}
