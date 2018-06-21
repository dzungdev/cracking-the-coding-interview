package com.dang.ctci.recursion;

public class PaintFill {
  
  enum Color {Black, White, Red, Yellow, Green}
  
  boolean paintFill(Color[][] screen, int row, int col, Color oColor, Color nColor) {
    if (row < 0 || row >= screen.length || col < 0 || col >= screen[0].length) {
      return false;
    }
    
    if (screen[row][col] == oColor) {
      paintFill(screen, row - 1, col, oColor, nColor);
      paintFill(screen, row + 1, col, oColor, nColor);
      paintFill(screen, row, col+1, oColor, nColor);
      paintFill(screen, row, col-1, oColor, nColor);
    }
    return true;
  }
}
