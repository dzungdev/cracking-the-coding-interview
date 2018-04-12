package com.dang.ctci.arr;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.List;

public class StringCompression {
 
  public String compress(String str) {
    List<SimpleEntry<Character, Integer>> compressList = new ArrayList<SimpleEntry<Character,Integer>>();
    char[] chars = str.toCharArray();
    compressList.add(new SimpleEntry<Character, Integer>(chars[0], 1));
    for(int i = 1; i < chars.length;i++) {
      if (chars[i] != chars[i-1]) {//new chars partition
        compressList.add(new SimpleEntry<Character, Integer>(chars[i], 1));
      } else {//increase the old char count
        SimpleEntry<Character, Integer> entry = compressList.get(compressList.size()-1);
        entry.setValue(entry.getValue()+1);
      }
    }
    char[] compressChars = new char[compressList.size() * 2];
    for (int i = 0; i < compressList.size();i++) {
      compressChars[i * 2] = compressList.get(i).getKey();
      compressChars[i * 2+1] = Character.forDigit(compressList.get(i).getValue(), 10);
    }
    String compressedStr = String.valueOf(compressChars);
    return compressedStr.length() < str.length() ? compressedStr : str;
  }
  
  public static void main(String[] args) {
    StringCompression app = new StringCompression();
    System.out.println(app.compress("aabcccccaaa"));
  }
  
}
