package com.dang.ctci.oop.obr;

import java.util.HashMap;
import java.util.Map;

public class UserManager {
  
  private Map<Integer, User> users = new HashMap<>();
  
  public User add(int id, String detail, int accountType) {
    if (users.containsKey(id)) {
      return null;
    }
    User user = new User(id, detail, accountType);
    users.put(id, user);
    return user;
  }
  
  public User findById(int userId) {return users.get(userId);}
  public boolean remove(int userId) {
    boolean result = false;
    if (users.containsKey(userId)) {
      users.remove(userId);
      result = true;
    }
    return result;
  }
  
  public boolean remove(User user) { return remove(user.getUserId()); }
  
  
}
