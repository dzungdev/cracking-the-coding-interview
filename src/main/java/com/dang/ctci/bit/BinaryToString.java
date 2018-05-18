package com.dang.ctci.bit;

public class BinaryToString {
  
  public String doubleToBinaryString(double num) {
    if (num >= 1 || num <= 0) return "ERROR";
    
    StringBuilder binary = new StringBuilder();
    binary.append(".");
    while ( num > 0) {
      if (binary.length() > 32) return "ERROR";
      
      double r = num * 2;
      System.out.println("r is: " + r);
      if (r >= 1) {
        binary.append("1");
        num = r -1;
        System.out.println("num is r-1: " + num);
      } else {
        binary.append("0");
        
        num = r;
        System.out.println("num = r: " + num);
      }
      System.out.println("");
    }
    return binary.toString();
  }
  
  public static void main(String[] args) {
    BinaryToString app = new BinaryToString();
    System.out.println(app.doubleToBinaryString(0.2));
  }
  
}
