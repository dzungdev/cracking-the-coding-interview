package com.dang.ctci.treegraph;

import com.dang.ctci.common.InputClazz;
import com.dang.ctci.common.TreeNode;

public class BinaryTreeTraversal {
  
  /**
   * left -> parent -> right
   * @param node
   */
  public void inOrderTraversal(TreeNode node) {
    if (node != null) {
      inOrderTraversal(node.left);
      System.out.print(node.data + " ");
      inOrderTraversal(node.right);
    }
  } 
  
  /**
   * parent -> left -> right
   * @param node
   */
  public void preOrderTraversal(TreeNode node) {
    if (node != null) {
      System.out.print(node.data + " ");
      preOrderTraversal(node.left);
      preOrderTraversal(node.right);
    }
  }
  
  /**
   * left -> right -> parent
   * @param node
   */
  public void postOrderTravel(TreeNode node) {
    if (node != null) {
      postOrderTravel(node.left);
      postOrderTravel(node.right);
      System.out.print(node.data + " ");
    }
  }
  
  public static void main(String[] args) {
    InputClazz ic = new InputClazz();
    TreeNode<Integer> root = ic.createBinaryTree(new Integer[] {10, 5 ,20, null, null, 3,7, 9,18});
    BinaryTreeTraversal app = new BinaryTreeTraversal();
    app.inOrderTraversal(root);
  }
  
}
