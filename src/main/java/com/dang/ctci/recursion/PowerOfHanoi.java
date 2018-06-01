package com.dang.ctci.recursion;

import java.util.Stack;

public class PowerOfHanoi {

  static class Tower {
    private Stack<Integer> disks = new Stack<>();
    private int            index;

    public Tower(int index) {
      this.index = index;
    }

    public int index() {
      return index;
    }

    public void add(int disk) {
      disks.push(disk);
    }

    public void moveTopTo(Tower tower) {
      int top = disks.pop();
      tower.add(top);
    }

    public void moveDisks(int n, Tower destination, Tower buffer) {
      if (n > 0) {
        moveDisks(n - 1, buffer, destination);
        moveTopTo(destination);
        buffer.moveDisks(n - 1, destination, this);
      }
    }
  }

  public static void main(String[] args) {
    int n = 3;
    Tower[] towers = new Tower[n];
    for (int i = 0; i < 3; i++) {
      towers[i] = new Tower(i);
    }

    for (int i = n - 1; i >= 0; i--) {
      towers[0].add(i);
    }
    towers[0].moveDisks(n, towers[2], towers[1]);
    
    while (!towers[2].disks.isEmpty()) {
      System.out.println(towers[2].disks.pop() + " ");
    }
  }

}
