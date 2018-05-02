package com.dang.ctci.linkedlist;

import com.dang.ctci.common.InputClazz;
import com.dang.ctci.common.Node;

public class Palindrome {
  
  public <T> boolean isPalindrome(Node<T> head) {
    Node<T> reversedHead = cloneAndReverse(head);
    return isEqual(head, reversedHead);
  }
  
  private <T> Node<T> cloneAndReverse(Node<T> head) {
    Node<T> newHead = null;
    Node<T> t = head;
    while (t != null) {
      Node<T> newNode = new Node<T>(t.val);
      newNode.next = newHead;
      newHead = newNode;
      t = t.next;
    }
    return newHead;
  }
  
  private <T> boolean isEqual(Node<T> head1, Node<T> head2) {
    Node<T> t1 = head1;
    Node<T> t2 = head2;
    while (t1 != null && t2 != null) {
      if (!t1.val.equals(t2.val)) return false;
      t1 = t1.next; t2 = t2.next;
    }
    return true;
  }
  
  public static void main(String[] args) {
    Palindrome app = new Palindrome();
   System.out.println(app.isPalindrome(InputClazz.createLinkedListNode(
                                         new String[] {"a", "b", "a"})));
  }
  
}
