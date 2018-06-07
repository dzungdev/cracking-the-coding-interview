package com.dang.ctci.oop.obr;

public class Display {
  
  private Book currBook;
  private User currUser;
  private int pageNumber = 0;
  
  public void displayUser(User user) {
    currUser = user;
    refreshUsername();
  }
  
  public void displayBook(Book book) {
    pageNumber = 0;
    currBook = book;
    
    refreshTitle();
    refreshDetails();
    refreshPage();
  }
  
  public void turnPageForward() {
    pageNumber++;
    refreshPage();
  }
  
  public void turnPageBackward() {
    pageNumber--;
    refreshPage();
  }
  
  public void refreshUsername() {}
  public void refreshTitle() {}
  public void refreshDetails() {}
  public void refreshPage() {}
  
}
