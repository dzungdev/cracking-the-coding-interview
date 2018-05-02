package com.dang.ctci.stackqueue;

import java.util.Stack;

public class QueueViaStack<T> {
  
  Stack<T> st1 = new Stack<T>();
  Stack<T> st2 = new Stack<T>();
  
  public void add(T data) {
    moveAllElement(st1, st2);
    st1.push(data);
    moveAllElement(st2, st1);
  }
  
  public T remove() {
    return st1.isEmpty() ? null : st1.pop();
  }
  
  private void moveAllElement(Stack<T> source, Stack<T> destination) {
    while (!source.isEmpty()) {
      T top = source.pop();
      st2.push(top);
    }
  }
  
  public static void main(String[] args) {
    
  }
  
}
