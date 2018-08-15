package com.dang.ctci.chapter10;

import java.util.Arrays;

public class SortedMerge {
  
  public void merge(int[] a, int[] b, int lastA, int lastB) {
    int indexA = lastA - 1;
    int indexB = lastB -1;
    int indexMerged = lastA + lastB -1;
    
    while (indexB >= 0) {
      if (indexA >= 0 && a[indexA] > b[indexB]) {
        a[indexMerged] = a[indexA];
        indexA--;
      } else {
        a[indexMerged] = b[indexB];
        indexB--;
      }
      indexMerged--;
    }
  }
  
  public static void main(String[] args) {
    int[] arrA = new int[] {2,4,6,8,0,0,0};
    int[] arrB = new int[] {1,3,5};
    
    SortedMerge app = new SortedMerge();
    app.merge(arrA, arrB, 4, 3);
    Arrays.stream(arrA).forEach(e -> System.out.print(e + " "));
  }
  
}
