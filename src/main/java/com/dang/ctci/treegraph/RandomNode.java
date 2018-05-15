package com.dang.ctci.treegraph;

import java.util.Random;

public class RandomNode {
  
  private int data;
  public RandomNode left;
  public RandomNode right;
  private int size = 0;
  
  public RandomNode(int d) {
    data = d;
    size = 1;
  }
  
  public void insetInOrder(int d) {
    if (d < data) {
      if (left == null) {
        left = new RandomNode(d);
      } else {
        left.insetInOrder(d);
      }
    } else {
      if (right == null) {
        right = new RandomNode(d);
      } else {
        right.insetInOrder(d);
      }
    }
    size++;
  }
  
  public int size() { return size; }
  public int getData() { return data; }
  
  public RandomNode find(int d) {
    if (data == d) {
      return this;
    } else if (d <= data) {
      return left != null ? left.find(d) : null;
    } else if (d > data) {
      return right != null ? right.find(d) : null;
    }
    return null;
  }
  
  public RandomNode getRandomNode() {
    int leftSize = left == null ? 0 : left.size();
    Random random = new Random();
    int index = random.nextInt(size);
    if (index < leftSize) {
      return left.getRandomNode();
    } else if (index == leftSize) {
      return this;
    } else {
      return right.getRandomNode();
    }
  }
  
  public static void main(String[] args) {
    RandomNode root = new RandomNode(20);
    root.insetInOrder(10);
    root.insetInOrder(30);
    root.insetInOrder(35);
    root.insetInOrder(5);
    root.insetInOrder(15);
    root.insetInOrder(3);
    root.insetInOrder(7);
    root.insetInOrder(17);
    
    System.out.println("root size: " + root.size());
    System.out.println("Node 10 size: " + root.left.size());
  }
  
}