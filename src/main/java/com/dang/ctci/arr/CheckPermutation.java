package com.dang.ctci.arr;

public class CheckPermutation {

  private boolean isPermuation(String str1, String str2) {
    return false;
  }

  private void permute(String str, int left, int right) {
    if (left == right) {
      System.out.println(str);
    } else {
      for(int i = left; i <= right; i++) {
        str = swap(str, left, i);
        permute(str, left + 1, right);
//        str = swap(str, left, i);
      }
    }
  }
  

  
//  private String swap(String str, int i, int j) {
//    char temp;
//    char[] chars = str.toCharArray();
//    temp = chars[i];
//    chars[i] = chars[j];
//    chars[j] = temp;
//    return String.valueOf(chars);
//  }
  
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
    String str = "ABC";
    int n = str.length();
    CheckPermutation app = new CheckPermutation();
    app.permute(str, 0, n -1 );
  }

}
