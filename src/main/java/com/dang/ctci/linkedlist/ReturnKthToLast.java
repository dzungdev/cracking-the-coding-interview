package com.dang.ctci.linkedlist;

import com.dang.ctci.common.InputClazz;
import com.dang.ctci.common.Node;

public class ReturnKthToLast {
  
  /**
   * We should use 2 pointer approach to solve problem
   * @param head
   * @param k
   * @return
   */
  public <T> Node<T> returnKthToLast(Node<T> head, int k) {
    if (head == null)
      return null;
    int index = 0;
    Node<T> temp1 = head;
    Node<T> temp2 = head;
    while (temp1 != null) {
      temp1 = temp1.next;
      if (++index > k && temp2 != null) {
        temp2 = temp2.next;
      }
    }
    return temp2;
  }

  public static void main(String[] args) {
    Node<Integer> head = InputClazz.createLinkedListNode(new Integer[] {1,2,8,3,7,0,4});
    ReturnKthToLast app = new ReturnKthToLast();
    System.out.println(app.returnKthToLast(head, 3).val);
  }

}
