package com.dang.ctci.linkedlist;

import com.dang.ctci.common.InputClazz;
import com.dang.ctci.common.Node;

public class RemoveDups {
  
  //We will use inner loop for each node as it doesn't allow temporary buffer
  //The time complexity will be O(n^2)
  public void deleteDups(Node head) {
    Node i = head;
    while (i != null) {
      Node j = i.next;
      Node prev = i;
      while (j != null) {
        if (j.val == i.val) {
          prev.next = j.next;
        }
        prev = j;
        j = j.next;
      }
      i = i.next;
    }
  }
  
  public static void main(String[] args) {
      Node head = InputClazz.createLinkedListNode(new Character[] {'F', 'O', 'L', 'L', 'O', 'W', 'U', 'P'});
      RemoveDups app = new RemoveDups();
      app.deleteDups(head);
      while (head != null) {
        System.out.print(head.val);
        head = head.next;
      }
  }
  
}
