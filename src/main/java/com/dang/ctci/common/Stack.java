package com.dang.ctci.common;

public class Stack<T> {
  
  private int capacity;
  public StackNode<T> top, bottom;
  public int size = 0;
  
  public Stack(int capacity) { this.capacity = capacity; }
  
  public void join(StackNode<T> above, StackNode<T> below) {
    if (below != null) below.above = above;
    if (above != null) above.below = below;
  }
  
  public boolean push(T data) {
    if (size > capacity) return false;
    size++;
    StackNode<T> newTop = new StackNode<T>(data);
    if (size == 1) bottom = newTop;
    join(newTop, top);
    top = newTop;
    return true;
  }
  
  public T pop() {
    StackNode<T> t = top;
    top = top.below;
    size--;
    return t.data;
  }
  
  public T removeBottom() {
    StackNode<T> b = bottom;
    bottom = bottom.above;
    if (bottom != null) bottom.below = null;
    size--;
    return b.data;
  }
  
  public boolean isEmpty() {
    return size == 0;
  }
  
  public boolean isFull() { return size == capacity; }
  
}
