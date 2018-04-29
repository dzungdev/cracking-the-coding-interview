package com.dang.ctci.stackqueue;

import java.util.ArrayList;
import java.util.List;

import com.dang.ctci.common.Stack;
import com.dang.ctci.common.StackNode;

public class SetOfStacks<T> {
  
  private int capacity;
  private List<Stack<T>> stacks = new ArrayList<Stack<T>>();
  
  public SetOfStacks(int capacity) {
    this.capacity = capacity;
  }
  /**
   * check in sizes to see which stack has capacity
   *  1. If one stack has capacity, use that stack to store new data stacks[i][sizes[i]] = newData
   *  2. If all stack are full, create new stack and increase the  numberOfStack, sizes
   *  
   * @param data
   */
  public void push(T data) {
    boolean isPushed = false;
    for (Stack<T> stack: stacks) {
      if (!stack.isFull()) {
        stack.push(data);
        isPushed = true;
        break;
      }
    }
    if (!isPushed) {//in the case all stacks are full, then we create new Stack
      Stack<T> newStack = new Stack<T>(capacity);
      newStack.push(data);
      stacks.add(newStack);
    }
  }
  
  public T pop() {
    return stacks.get(stacks.size() - 1).pop();
  }
  
  public T popAt(int index) {
    return leftShift(index, true); 
  }
  
  public T leftShift(int index, boolean removeTop) {
    Stack<T> stack = stacks.get(index);
    T removed_item = removeTop ? stack.pop() : stack.removeBottom();
    if (stack.isEmpty()) {
      stacks.remove(index);
    } else if (stack.size > index + 1) {// this one means the delete at stack 1, then we need to move from stack2 and stack 3
      T v = leftShift(index + 1, false);
      stack.push(v);
    }
    return removed_item;
  }
  
}
