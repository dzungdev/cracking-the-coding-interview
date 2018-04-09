package com.dang.ctci.arr;

public class OneAway {
  public boolean isOneAWay(String str1, String str2) {
    int l1 = str1.length();
    int l2 = str2.length();
    char[] cs1 = str1.toCharArray();
    char[] cs2 = str2.toCharArray();
    int diffCharNum = 0;
    if (l1 == l2) {
      for (int i =0; i < l1; i++) {
        if (cs1[i] != cs2[i]) diffCharNum++;
      }
    } else {
      if (l1 < l2) {
        for (int i = 0; i < l2; i++) {
          if (i - diffCharNum < l1 && cs2[i] != cs1[i-diffCharNum]) diffCharNum++;
          if (diffCharNum > 2) return false;
        }
      } else {
        for (int i = 0; i < l1;i++) {
          if (i-diffCharNum < l2 && cs1[i] != cs2[i-diffCharNum]) diffCharNum++;
          if (diffCharNum > 2) return false;
        }
      }
    }
    
    return diffCharNum < 2;
  }
  
  public static void main(String[] args) {
    OneAway app = new OneAway();
    String str1 = "pale";
    String str2 = "bake";
    System.out.println(app.isOneAWay(str1, str2));
  }
}
