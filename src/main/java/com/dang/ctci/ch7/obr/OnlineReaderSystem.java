package com.dang.ctci.ch7.obr;

public class OnlineReaderSystem {
  
  private Library library;
  private UserManager userManager;
  private Display display;
  
  private Book activeBook;
  private User activeUser;
  
  public OnlineReaderSystem() {
    userManager = new UserManager();
    library = new Library();
    display = new Display();
  }

  public Library getLibrary() {
    return library;
  }

  public UserManager getUserManager() {
    return userManager;
  }

  public Display getDisplay() {
    return display;
  }

  public Book getActiveBook() {
    return activeBook;
  }

  public void setActiveBook(Book activeBook) {
    this.activeBook = activeBook;
  }

  public User getActiveUser() {
    return activeUser;
  }

  public void setActiveUser(User activeUser) {
    this.activeUser = activeUser;
  }
  
}
