package com.dang.ctci.treegraph;

import com.dang.ctci.common.TreeNode;

public class Successor {
  
  public TreeNode<Integer> getInOrderSuccessor(TreeNode<Integer> node) {
    if (node.right == null) {
      TreeNode<Integer> parent = node.parent;
      while (parent != null && node == parent.right) {
        node = parent;
        parent = node.parent;
      }
      return parent;
    } else {
      return minValue(node.right);
    }
  }
  
  public TreeNode<Integer> minValue(TreeNode<Integer> node) {
    TreeNode<Integer> current = node;
    
    while (current != null) {
      current = current.left;
    }
    
    return current;
  }
  
}
