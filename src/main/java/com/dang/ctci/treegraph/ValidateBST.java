package com.dang.ctci.treegraph;

import com.dang.ctci.common.InputClazz;
import com.dang.ctci.common.TreeNode;

public class ValidateBST {
  
  boolean validateBST(TreeNode<Integer> root) {
    return validateBST(root, null, null);
  }
  
  private boolean validateBST(TreeNode<Integer> root, Integer min, Integer max) {
    if (root == null) return true;
    
    if ((min != null && root.data <= min) || (max != null && root.data >= max)) {
      return false;
    }
    
    if (!validateBST(root.left, min, root.data) || !validateBST(root.right, root.data, max)) {
      return false;
    }
    return true;
  }
  
  public static void main(String[] args) {
    TreeNode<Integer> root = InputClazz.createBinaryTree(new Integer[] {10, 8,15,7,9,11,20});
    ValidateBST app = new ValidateBST();
    System.out.println(app.validateBST(root));
  }
  
}
