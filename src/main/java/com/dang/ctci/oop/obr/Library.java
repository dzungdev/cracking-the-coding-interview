package com.dang.ctci.oop.obr;

import java.util.HashMap;
import java.util.Map;

public class Library {
  
  private Map<Integer, Book> books = new HashMap<>();
  
  public Book addBook(int id, String details) {
    if (books.containsKey(id)) return null;
    Book book = new Book(id, details);
    books.put(id, book);
    return book;
  }
  
  public Book findBookById(int bookId) {
    return books.get(bookId);
  }
  
  public Book delete(int bookId) {
    return books.remove(bookId);
  }
  
  public boolean remove(Book b) { return remove(b.getId());}
  public boolean remove(int bookId) {
    boolean result = false;
    if (books.containsKey(bookId)) {
      books.remove(bookId);
      result = true;
    }
    return result;
  }
  
  public Book findById(int bookId) {
    return books.get(bookId); 
  }
  
}
