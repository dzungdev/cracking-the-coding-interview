package com.dang.ctci.common;

public class TreeNode<T> {
  
  public T data;
  public TreeNode<T> left, right, parent;
  
  public TreeNode(T data) {
    this.data = data;
  }
  
}
