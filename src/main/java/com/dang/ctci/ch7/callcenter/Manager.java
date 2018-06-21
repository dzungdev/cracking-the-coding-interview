package com.dang.ctci.ch7.callcenter;

public class Manager extends Employee {
  public Manager(CallHandler callHandler) {
    super(callHandler);
    rank = Rank.MANAGER;
  }
}
