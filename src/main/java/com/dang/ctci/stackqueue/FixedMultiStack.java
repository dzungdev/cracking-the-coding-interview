package com.dang.ctci.stackqueue;

import com.dang.ctci.exception.EmptyStackException;
import com.dang.ctci.exception.FullStackException;

public class FixedMultiStack {
  
  private int numberOfStacks = 3;
  private int stackCapacity;
  private int[] values;
  private int[] sizes;
  
  public FixedMultiStack(int stackSize) {
    stackCapacity = stackSize;
    values = new int[stackCapacity * numberOfStacks];
    sizes = new int[numberOfStacks];
  }
  
  public void push(int stackNum, int value) throws FullStackException {
    if (isFull(stackNum)) throw new FullStackException();
    sizes[stackNum]++;
    values[indexOfTop(stackNum)] = value;
  }
  
  public int pop(int stackNum) throws EmptyStackException {
    if (isEmpty(stackNum)) throw new EmptyStackException();
    int topIndex = indexOfTop(stackNum);
    int value = values[topIndex];
    values[topIndex] = 0;
    sizes[stackNum]--;
    return value;
  }
  
  public int peek(int stackNum) throws EmptyStackException {
    if (isEmpty(stackNum)) throw new EmptyStackException();
    int topIndex = indexOfTop(stackNum);
    return values[topIndex];
  }
  
  public boolean isEmpty(int stackNum) {
    return sizes[stackNum] == 0;
  }
  
  public boolean isFull(int stackNum) {
    return sizes[stackNum] == stackCapacity;
  }
  
  private int indexOfTop(int stackNum) {
    int offset = stackNum * stackCapacity;
    int size = sizes[stackNum];
    return offset + size -1;
  }
  
}
