package com.dang.ctci.bit;

public class BitOperation {
  
  public boolean getBit(int num, int i) {
    return (num & (1 << i)) != 0;
  }
  
  public int setBit(int num, int i) {
    return num | (1 << i);
  }
  
  public int clearBit(int num, int i) {
    int mask = ~(1 << i);
    return num & mask;
  }
  
  public int clearBitsMSBthroughI(int num, int i) {
    int mask = (1 << i) - 1;
    return num & mask;
  }
  
  public int clearBitsIthrough0(int num, int i) {
    int mask = (-1 << (i+1));
    return num & mask;
  }
  
  public int updateBit(int num, int i, boolean isBit1) {
    int value = isBit1 ? 1 : 0;
    int mask = ~(1 << i);
    System.out.println("shift " + i + ": " + (1 << i));
    System.out.println("mask: " + (~8));
    return (num & mask) | (value << i);
  }
  
  public static void main(String[] args) {
    BitOperation app = new BitOperation();
    System.out.println("result: " + app.updateBit(128, 3, true));
  }
  
}
