package com.dang.ctci.chapter10;

import java.util.List;

public class SortedSearchNoSize {

  private int binarySearch(List<Integer> list, int value, int start, int end) {
    int mid;

    while (start <= end) {
      mid = (start + end) / 2;
      int middle = list.get(mid);
      if (middle > value || middle  == -1) {
        end = mid - 1;
      } else if (mid < value) {
        start = mid + 1;
      } else {
        return mid;
      }
    }
    return -1;
  }

  public int search(List<Integer> list, int value) {
    int index = 1;
    while (list.get(index) != -1 && list.get(index) < value) {
      index *= 2;
    }
    return binarySearch(list, value, index/2, index);
  }

}
