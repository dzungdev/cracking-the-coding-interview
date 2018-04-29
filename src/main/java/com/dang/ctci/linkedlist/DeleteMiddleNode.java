package com.dang.ctci.linkedlist;

import com.dang.ctci.common.InputClazz;
import com.dang.ctci.common.Node;

public class DeleteMiddleNode {
  
  public void deleteMiddleNode(Node<String> node) {
    Node<String> temp = node;
    while (temp.next.val != node.val) {
      temp = temp.next;
    }
    temp.next = temp.next.next;
  }
  
  public static void main(String[] args) {
    DeleteMiddleNode app = new DeleteMiddleNode();
    Node<String> head = InputClazz.createCycleLinkedList(new String[] {"a", "b", "c", "d", "e", "f"});
    Node<String> deleteNode = head;
    while (deleteNode != null) {
      if (deleteNode.val.equals("c")) {
        break;
      }
      deleteNode = deleteNode.next;
    }
    
    app.deleteMiddleNode(deleteNode);
    
    while (head != null) {
      System.out.println(head.val + " ");
      if (head.val == "f") break;
      head = head.next;
    }
  }
  
}
