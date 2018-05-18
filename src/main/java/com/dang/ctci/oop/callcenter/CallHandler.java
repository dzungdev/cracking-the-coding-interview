package com.dang.ctci.oop.callcenter;

import java.util.ArrayList;
import java.util.List;

public class CallHandler {
  
  private final int LEVELS = 3;
  
  private final int RESPONDENT_IDX = 0;
  private final int MANAGER_IDX = 1;
  private final int DIRECTOR_IDX = 2;
  
  List<List<Employee>> employees = new ArrayList<>();
  
  List<List<Call>> callQueues = new ArrayList<>();
  
  public Employee findHandlerForCall(Call call) {
    for (Employee respondent: employees.get(0)) {
      if (respondent.isFree()) return respondent;
    }
    return null;
  }
  
  
  
  public void receiveCall(Caller caller) {
    
  }
  
  public void dispatchCall(Call call) {
    
  }
  
}
