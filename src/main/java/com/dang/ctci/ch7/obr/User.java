package com.dang.ctci.ch7.obr;

public class User {

  private int    userId;
  private String details;
  private int    accountType;

  public User(int userId, String details, int accountType) {
    super();
    this.userId = userId;
    this.details = details;
    this.accountType = accountType;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public int getAccountType() {
    return accountType;
  }

  public void setAccountType(int accountType) {
    this.accountType = accountType;
  }

}
