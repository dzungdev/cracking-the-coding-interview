package com.dang.ctci.ch7.callcenter;

public class Director extends Employee {
  
  public Director(CallHandler callHandler) {
    super(callHandler);
    rank = Rank.DIRECTOR;
  }
  
}
