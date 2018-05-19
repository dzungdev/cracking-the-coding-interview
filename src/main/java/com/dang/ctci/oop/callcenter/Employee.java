package com.dang.ctci.oop.callcenter;

public abstract class Employee {
  
  private Call currentCall;
  protected Rank rank;
  protected CallHandler callHandler;
  
  public Employee(CallHandler callHandler) {
    this.callHandler = callHandler;
  }
  
  public void pickupCall(Call call) {
    this.currentCall = call;
    this.currentCall.setHandler(this);
  }
  
  public void completeCall() {
    this.currentCall = null;
    callHandler.assignNextCall(this);
  }
  
  public void escalateCall() {
    Rank newRank = Rank.getRankByValue(currentCall.getRank().getValue() + 1);
    currentCall.setRank(newRank);
    callHandler.dispatchCall(currentCall);
    completeCall();
  }
  
  public boolean isFree() {return currentCall == null;}
  public Rank getRank() {return rank;}
  
}
