package com.dang.ctci.oop.callcenter;

public abstract class Employee {
  
  private Call currentCall;
  protected Rank rank;
  
  public void pickupCall(Call call) {}
  
  public void completeCall() {}
  
  public void escalateCall() {}
  
  public boolean isFree() {return currentCall == null;}
  public Rank getRank() {return rank;}
  
}
