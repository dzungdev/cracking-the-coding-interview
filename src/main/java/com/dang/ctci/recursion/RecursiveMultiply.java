package com.dang.ctci.recursion;

public class RecursiveMultiply {
  
  public int minProduct(int a, int b) {
    int bigger = a > b ? a : b;
    int smaller = a > b ? b : a;
    return minProductHelper(smaller, bigger);
  }
  
  public int minProductHelper(int smaller, int bigger) {
    if (smaller == 0) {
      return 0;
    } else if (smaller == 1) {
      return bigger;
    }
    
    int s = smaller >> 1;//Divide by 2
    int half1 = minProduct(s, bigger);
    int half2 = half1;
    if (smaller % 2 == 1) {
      half2 = minProduct(smaller - s, bigger);
    }
    return half1 + half2;
  }
  
  public static void main(String[] args) {
    RecursiveMultiply app = new RecursiveMultiply();
    System.out.println(app.minProduct(7, 8));
  }
  
}
