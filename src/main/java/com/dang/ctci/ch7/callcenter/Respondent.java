package com.dang.ctci.ch7.callcenter;

public class Respondent extends Employee {
  
  public Respondent(CallHandler callHandler) {
    super(callHandler);
    rank = Rank.RESPONDENT;
  }

}
