package com.dang.ctci.linkedlist;

public class MyLinkedList<T> {
  
  MyNode<T> head;
  
  MyNode<T> delete(MyNode<T> head, T val) {
    MyNode<T> n = head;
    if (n == null) return null;
    if (n.getVal() == val) {
      return head.getNext();
    }
    while (n.getNext() != null) {
      if (n.getNext().getVal() == val) {
        n.setNext(n.getNext().getNext());
        return head;
      }
      n = n.getNext();
    }
    return head;
  }
}
