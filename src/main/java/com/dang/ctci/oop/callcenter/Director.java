package com.dang.ctci.oop.callcenter;

public class Director extends Employee {
  
  public Director(CallHandler callHandler) {
    super(callHandler);
    rank = Rank.DIRECTOR;
  }
  
}
