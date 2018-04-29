package com.dang.ctci.common;

public class StackNode<T> {
  
  public T data;
  public StackNode<T> above;
  public StackNode<T> below;
  
  public StackNode(T data) {
    this.data = data;
  }
  
}
