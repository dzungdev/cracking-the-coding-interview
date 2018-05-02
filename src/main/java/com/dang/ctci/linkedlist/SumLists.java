package com.dang.ctci.linkedlist;

import com.dang.ctci.common.Node;

public class SumLists {
  
  /**
   * This is same with https://leetcode.com/problems/add-two-numbers
   * @param l1
   * @param l2
   * @return
   */
  
  
  public Node<Integer> sumLists(Node<Integer> l1, Node<Integer> l2) {
    if (l1 == null || l2 == null)
      return null;
    int prevNum = (l1.val + l2.val) / 10;
    Node<Integer> newHead = new Node<Integer>((l1.val + l2.val) % 10);
    Node<Integer> temp = newHead;
    Node<Integer> temp1 = l1.next;
    Node<Integer> temp2 = l2.next;
    while (temp1 != null || temp2 != null || prevNum > 0) {
      int curVal = ((temp1 == null ? 0 : temp1.val) + (temp2 == null ? 0 : temp2.val) + prevNum) % 10;
      prevNum = ((temp1 == null ? 0 : temp1.val) + (temp2 == null ? 0 : temp2.val) + prevNum) / 10;
      Node<Integer> newNode = new Node<Integer>(curVal);
      temp.next = newNode;
      temp = newNode;
      temp1 = temp1 == null ? null : temp1.next;
      temp2 = temp2 == null ? null : temp2.next;
    }
    return newHead;
  }

}
