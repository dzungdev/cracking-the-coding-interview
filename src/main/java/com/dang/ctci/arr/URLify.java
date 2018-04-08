package com.dang.ctci.arr;

public class URLify {
  
  public String urlify(String str, int trueLength) {
    int spaceCnt = 0;
    char[] chars = str.toCharArray();
    for (int i = trueLength-1; i >= 0; i--) {
      if (chars[i] == ' ') spaceCnt++;
    }
    
    for (int i = trueLength -1;i >= 0;i--) {
      if (chars[i] == ' ') {
        chars[i+ spaceCnt * 2] = '0';
        chars[i+ spaceCnt * 2 - 1] = '2';
        chars[i + spaceCnt * 2 - 2] = '%';
        spaceCnt--;
      } else {
        chars[i+ spaceCnt*2] = chars[i];
      }
    }
    return String.valueOf(chars);
  }
  
  public static void main(String[] args) {
    String str = "Mr John Smith    ";
    URLify main = new URLify();
    System.out.println(main.urlify(str, 13));
  }
  
}
