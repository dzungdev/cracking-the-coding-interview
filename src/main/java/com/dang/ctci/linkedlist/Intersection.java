package com.dang.ctci.linkedlist;

import com.dang.ctci.common.Node;

public class Intersection {
  
  private class TailAndSize<T> {
    public Node<T> tail;
    public int size;
    
    public TailAndSize(Node<T> tail, int size) {
      this.tail = tail;
      this.size = size;
    }
  }
  
  private <T> TailAndSize<T> getTailAndSize(Node<T> head) {
    Node<T> t = head;
    Node<T> tail = null;
    int size = 0;
    while (t != null) {
      size++;
      if (t.next == null) tail = t;
      t = t.next;
    }
    return new TailAndSize<T>(tail, size);
  }
  
  private <T> Node<T> getKthNode(Node<T> head, int k) {
    Node<T> t = head;
    while (k > 0) {
      k--;
      t = t.next;
    }
    return t;
  } 
  
  public <T> Node<T> intersection(Node<T> head1, Node<T> head2) {
    TailAndSize<T> tailSize1 = getTailAndSize(head1);
    TailAndSize<T> tailSize2 = getTailAndSize(head2);
    //if tail is different, then we return null
    if (tailSize1.tail != tailSize2.tail) return null;
    
    Node<T> longer = tailSize1.size >= tailSize2.size ? head1 : head2;
    Node<T> shorter = tailSize1.size >= tailSize2.size ? head2 : head1;
    
    longer = getKthNode(longer, Math.abs(tailSize1.size - tailSize2.size));
    while (longer != shorter) {
      longer = longer.next;
      shorter = shorter.next;
    }
    
    return longer;
  }
  
  
  
}
