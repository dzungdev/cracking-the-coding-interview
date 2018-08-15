package com.dang.ctci.chapter10;

import java.util.Arrays;
import java.util.Comparator;

public class GroupAnagrams {

  private static String sort(String s) {
    char[] chars = s.toCharArray();
    Arrays.sort(chars);
    return new String(chars);
  }

  public void sortAnagrams(String[] strings) {
    Comparator<String> anagramComparator = (String str1, String str2) -> sort(str1).compareTo(sort(str2));
    Arrays.sort(strings, anagramComparator);
  }
  
  
  public static void main(String[] args) {
    String[] strs = new String[] {"tar", "arc", "rat", "car"};
    GroupAnagrams app = new GroupAnagrams();
    app.sortAnagrams(strs);
    Arrays.stream(strs).forEach(e -> System.out.print(e + " "));
  }

}
