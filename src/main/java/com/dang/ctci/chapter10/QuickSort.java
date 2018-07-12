package com.dang.ctci.chapter10;

import java.util.Arrays;

public class QuickSort {
  
  private void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
  
  private int getPivotIndex(int[] arr, int start, int end) {
    int pivot = arr[end];
    int k = start;
    for (int i = start; i <= end - 1; i++) {
      if (arr[i] <= pivot) {
        swap(arr, k, i);
        k++;
      }
    }
    swap(arr, k, end);
    return k;
  }
  
  private void quickSort(int[] arr, int start, int end) {
    if (start < end) {
      int pivotIndex = getPivotIndex(arr, start, end);
      quickSort(arr, start, pivotIndex - 1);
      quickSort(arr, pivotIndex + 1, end);
    }
  }
  
  public void quickSort(int[] arr) {
    quickSort(arr, 0, arr.length - 1);
  }
  
  public static void main(String[] args) {
    QuickSort app = new QuickSort();
    int[] arr = new int[] {7,2,1,6,8,5,3,4};
    app.quickSort(arr);
    Arrays.stream(arr).forEach(e -> {System.out.print(e + " ");});
  }
  
}
