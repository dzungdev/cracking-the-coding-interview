package com.dang.ctci.linkedlist;

public class MyNode<T> {
  
  private T val;
  private MyNode<T> next;
  
  public MyNode(T t) {
    this.val = t;
  }
  
  void appendToTail(T t) {
    MyNode<T> newNode = new MyNode<T>(t);
    MyNode<T> temp = this;
    while (temp.next != null) {
      temp = temp.next;
    }
    

    temp.next = newNode;
  }
  
  public T getVal() {
    return val;
  }

  public void setVal(T val) {
    this.val = val;
  }

  public MyNode<T> getNext() {
    return next;
  }

  public void setNext(MyNode<T> next) {
    this.next = next;
  }
  
  
  
}
