package com.dang.ctci.ch7.obr;

public class Book {
  
  private int id;
  private String details;
  
  
  public Book(int id, String details) {
    super();
    this.id = id;
    this.details = details;
  }
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getDetails() {
    return details;
  }
  public void setDetails(String details) {
    this.details = details;
  }
  
}
