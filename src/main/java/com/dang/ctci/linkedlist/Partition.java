package com.dang.ctci.linkedlist;

import com.dang.ctci.common.InputClazz;
import com.dang.ctci.common.Node;

public class Partition {
  
  public Node<Integer> partition(Node<Integer> head, int x) {
    if (head == null) return head;
    Node<Integer> temp = head, newHead = null;
    Node<Integer> prevFirstGreaterX = null;
    Node<Integer> firstGreaterX = null;
    Node<Integer> prev = null;
    while (temp != null) {
      if (temp.val  >= x && firstGreaterX == null) {
        firstGreaterX = temp;
        prevFirstGreaterX = prev;
        prev = temp;temp = temp.next;
      } else if (temp.val < x && firstGreaterX != null) {
        if (prevFirstGreaterX == null) {//in case the head >= x, create new head with temp val
          newHead = new Node<Integer>(temp.val);
          prev.next = temp.next;
          prevFirstGreaterX = newHead;
          newHead.next = firstGreaterX;
        } else {// the head < x, then we swap the temp to before first Greater X
          prev.next = temp.next;
          prevFirstGreaterX.next = temp;
          temp.next = firstGreaterX;
          prevFirstGreaterX = temp;
        }
        temp = prev.next;
      } else {
        prev = temp;temp = temp.next;
      }
    }
    return newHead == null ? head : newHead;
  } 
  
  public static void main(String[] args) {
    Partition app = new Partition();
    Node<Integer> head = InputClazz.createLinkedListNode(new Integer[] {3,5,3,8,10,2});
    Node<Integer> partitionedHead = app.partition(head, 5);
    while (partitionedHead != null) {
      System.out.print(partitionedHead.val + " ");
      partitionedHead = partitionedHead.next;
    }
  }
  
}
