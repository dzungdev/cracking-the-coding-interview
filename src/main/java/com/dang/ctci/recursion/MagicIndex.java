package com.dang.ctci.recursion;

public class MagicIndex {
  
  public int getMagicIndex(int[] nums) {
    return getMagicIndex(nums, 0, nums.length - 1);
  }
  
  public int getMagicIndex(int[] nums, int start, int end) {
    if (end < start) return -1;
    
    int midIdx = (start + end)/2;
    if (midIdx == nums[midIdx]) return midIdx;
    
    int leftEndIndex = Math.min(midIdx - 1, nums[midIdx]);
    int leftIndex = getMagicIndex(nums, start, leftEndIndex);
    if (leftIndex >= 0) return leftIndex;
    
    int rightStartIndex = Math.max(midIdx + 1, nums[midIdx]);
    int rightIndex = getMagicIndex(nums, rightStartIndex, end);
    
    return rightIndex;
  }
  
}
