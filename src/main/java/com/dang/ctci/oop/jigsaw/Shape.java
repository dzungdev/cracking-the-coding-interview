package com.dang.ctci.oop.jigsaw;

public enum Shape {
  
  INNER, OUTER, FLAT;
  
  public Shape getShape() {
    switch(this) {
      case INNER: return INNER;
      case OUTER: return OUTER;
      case FLAT: return FLAT;
      default: return null;
    }
  }
}
