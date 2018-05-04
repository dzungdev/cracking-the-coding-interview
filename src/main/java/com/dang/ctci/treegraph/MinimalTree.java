package com.dang.ctci.treegraph;

import com.dang.ctci.common.TreeNode;

public class MinimalTree<T> {
  
  public TreeNode<T> createMinimalBST(T[] arr) {
    return createMinimalBST(arr, 0, arr.length - 1);
  }
  
  private TreeNode<T> createMinimalBST(T[] arr, int start, int end) {
    if (end < start) return null;
    
    int mid = (start + end) / 2;
    TreeNode<T> root = new TreeNode<T>(arr[mid]);
    root.left = createMinimalBST(arr, start, mid -1);
    root.right = createMinimalBST(arr, mid + 1, end);
    return root;
  }
  
}
