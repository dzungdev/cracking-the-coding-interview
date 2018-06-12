package com.dang.ctci.oop.jigsaw;

public enum EdgePosition {
  LEFT, TOP, RIGHT, BOTTOM;
  
  public EdgePosition getEdgePosition() {
    switch(this) {
      case LEFT: return LEFT;
      case TOP: return TOP;
      case RIGHT: return RIGHT;
      case BOTTOM: return BOTTOM;
      default: return null;
    }
  } 
  
}
