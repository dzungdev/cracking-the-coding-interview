package com.dang.ctci.oop.callcenter;

public class Call {
  
  private Rank rank;
  
  private Caller caller;
  private Employee handler;
  
  public Call(Caller caller) {
    this.caller = caller;
  }
  
  public void setRank(Rank rank) {
    this.rank = rank;
  }
  
  public Rank getRank() {
    return rank;
  }
  
}
