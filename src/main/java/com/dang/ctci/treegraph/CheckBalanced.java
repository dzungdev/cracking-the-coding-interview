package com.dang.ctci.treegraph;

import com.dang.ctci.common.TreeNode;

public class CheckBalanced<T> {
  
  public boolean isBalanced(TreeNode<T> root) {
    return height(root) != Integer.MIN_VALUE;
  }
  
  public int height(TreeNode<T> root) {
    if (root == null) return 0;//base case
    
    int leftHeight = height(root.left);
    if (leftHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE;
    
    int rightHeight = height(root.right);
    if (rightHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE;
    
    if (Math.abs(leftHeight - rightHeight) > 1) {
      return Integer.MIN_VALUE;
    } else {
      return 1 + Math.max(leftHeight, rightHeight);
    }
  }

}
