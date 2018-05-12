package com.dang.ctci.treegraph;

import com.dang.ctci.common.TreeNode;

public class CheckSubTree<T> {

  boolean containsTree(TreeNode<T> t1, TreeNode<T> t2) {
    if (t2 == null) return true;
    return isSubTree(t1, t2);
  }

  private boolean isSubTree(TreeNode<T> root1, TreeNode<T> root2) {
    if (root1 == null) {// loop all t1 but can't find t2
      return false;
    } else if (root1.data == root2.data && matchTree(root1, root2)) {
      return true;
    }
    return isSubTree(root1.left, root2) || isSubTree(root1.right, root2);
  }

  private boolean matchTree(TreeNode<T> root1, TreeNode<T> root2) {
    if (root1 == null && root2 == null) {
      return true;// loop all node in tree2
    } else if (root1 == null || root2 == null) {
      return false;
    } else if (root1.data != root2.data) {
      return false;
    } else {
      return matchTree(root1.left, root2.left) && matchTree(root1.right, root2.right);
    }

  }

}
