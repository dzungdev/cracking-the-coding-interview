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
    for (Employee emp: employees.get(call.getRank().getValue())) {
      if (emp.isFree()) return emp;
    }
    return null;
  }
  
  public void receiveCall(Caller caller) {
    Call call = new Call(caller);
    dispatchCall(call);
  }
  
  public void dispatchCall(Call call) {
    Employee emp = findHandlerForCall(call);
    if (emp == null) {//put to queue
      callQueues.get(call.getRank().getValue()).add(call);
    } else {
      emp.pickupCall(call);
    }
  }
  
  public void assignNextCall(Employee emp) {
    if (callQueues.get(emp.getRank().getValue()).isEmpty() == false) {
      emp.pickupCall(callQueues.get(emp.getRank().getValue()).remove(0));
    }
  }
  
}
