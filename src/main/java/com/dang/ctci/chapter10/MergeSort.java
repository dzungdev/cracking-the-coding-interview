package com.dang.ctci.chapter10;

import java.util.Arrays;
import java.util.stream.Stream;

import javax.xml.transform.stream.StreamSource;

public class MergeSort {
 
  private void merge(int[] arr, int[] left, int[] right) {
    int k = 0, i = 0, j = 0;
    while (i < left.length && j < right.length) {
      if (left[i] <= right[j]) {
        arr[k] = left[i];
        i++;
        
      } else {
        arr[k] = right[j];
        j++;
      }
      k++;
    }
    while (i < left.length) {
      arr[k] = left[i];
      k++;i++;
    }
    while (j < right.length) {
      arr[k] = right[j];
      k++;j++;
    }
  }
  
  private void mergeSort(int[] arr) {
    if (arr.length < 2) return;
      int mid = (arr.length) / 2;
      int[] leftArr = new int[mid];
      int[] rightArr = new int[arr.length - mid];
      for (int i = 0; i < mid;i++) {
        leftArr[i] = arr[i];
      }
      for (int i = mid; i < arr.length;i++) {
        rightArr[i-mid] = arr[i];
      }
      mergeSort(leftArr);
      mergeSort(rightArr);
      merge(arr, leftArr, rightArr);
  }
  
  public static void main(String[] args) {
    MergeSort app = new MergeSort();
    int[] arr = new int[] {2,4,1,6,8,5,3,7}; 
    app.mergeSort(arr);
    Arrays.stream(arr).forEach(e -> System.out.print(e + " "));
  }
  
}
