package com.dang.ctci.treegraph;

import com.dang.ctci.common.TreeNode;

public class FirstCommonAncestor<T> {
  
  public TreeNode<T> commonAncestor(TreeNode<T> root, TreeNode<T> p, TreeNode<T> q) {
    if (root == null) return null;
    if (root == p || root == q) return root;
    
    TreeNode<T> leftAncestor = commonAncestor(root.left, p, q);
    // found common ancestor is in left side 
    if (leftAncestor != null && leftAncestor != p && leftAncestor != q) return leftAncestor;
    
    TreeNode<T> rightAncestor = commonAncestor(root.left, p, q);
    //found common ancestor is in right side
    if (rightAncestor != null && rightAncestor != p && rightAncestor != q) return rightAncestor;
    
    if (leftAncestor != null & rightAncestor != null) {
      return root;//the common ancestor when p,q are in different side 
    } else if (root == p || root == q) {
      return root; //This is for case q is child of p or vice versa 
    } else {
      return leftAncestor == null ? rightAncestor : leftAncestor;
    }
  }
  
}
