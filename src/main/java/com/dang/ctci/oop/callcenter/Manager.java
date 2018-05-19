package com.dang.ctci.oop.callcenter;

public class Manager extends Employee {
  public Manager(CallHandler callHandler) {
    super(callHandler);
    rank = Rank.MANAGER;
  }
}
