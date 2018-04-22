package com.dang.ctci.common;

public class InputClazz {
  
  public static <T> Node<T> createLinkedListNode(T[] arr) {
    Node<T> head = new Node(arr[0]);
    Node<T> temp = head;
    if (arr.length > 1) {
      for (T data: arr) {
        Node newNode = new Node(data);
        temp.setNext(newNode);
        temp = newNode;
      }
    }
    return head;
  }
  
}
