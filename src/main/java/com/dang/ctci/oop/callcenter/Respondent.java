package com.dang.ctci.oop.callcenter;

public class Respondent extends Employee {
  
  public Respondent(CallHandler callHandler) {
    super(callHandler);
    rank = Rank.RESPONDENT;
  }

}
