package com.dang.ctci.ch7.chatserver;

public class User {
  
  private Long id;
  private String accountName;
  
  public User(Long id, String accountName) {
    super();
    this.id = id;
    this.accountName = accountName;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getAccountName() {
    return accountName;
  }

  public void setName(String accountName) {
    this.accountName = accountName;
  }
  
}
