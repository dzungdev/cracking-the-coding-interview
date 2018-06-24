package com.dang.ctci.ch7.chatserver;

import java.util.HashMap;
import java.util.Map;

public class UserManager {
  
  private static UserManager instance;
  
  public static UserManager getInstance() {
    if (instance == null) instance = new UserManager();
    return instance;
  }
  
  private Map<Integer, User> usersByIdMap = new HashMap<>();
  
  private Map<String, User> usersByAccountNameMap = new HashMap<>(); 
  
  public void addUser(User fromUser, String toUser) {}
  public void approveAddRequest(AddRequest req) {}
  public void rejectAddRequest(AddRequest req) {}
  public void signIn(String accountName) {}
  public void signOff(String accountName) {}
  
}
