package com.dang.ctci.recursion;

import java.util.ArrayList;
import java.util.List;

public class Parens {
  
  public void addParen(List<String> results, int leftRemaining, int rightRemaining, char[] str, int index) {
    if (leftRemaining < 0 || rightRemaining < leftRemaining) return;
    if (leftRemaining == 0 && rightRemaining == 0) {
      System.out.println(String.valueOf(str));
      results.add(String.valueOf(str));
    } else {
      str[index] = '(';
      addParen(results, leftRemaining - 1, rightRemaining, str, index+1);
      
      str[index] = ')';
      addParen(results, leftRemaining, rightRemaining - 1, str, index+1);
    }
  }
  
  public List<String> addParen(int n) {
    char[] str = new char[n*2];
    List<String> results = new ArrayList<>();
    addParen(results, n, n, str, 0);
    return results;
  }
  
  public static void main(String[] args) {
    Parens app = new Parens();
    app.addParen(3);
  }
  
}
