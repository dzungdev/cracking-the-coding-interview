package com.dang.ctci.arr;

public class ZeroMatrix {
  
  //Brute force: n^3
  public void zeroMatrix(int[][] matrix) {
    int rowNum = matrix.length;
    int colNum = matrix[0].length;
    for (int i = 0; i < rowNum;i++) {
      for (int j = 0; j < colNum;j++) {
        if (matrix[i][j] == 0) {
          for (int k = 0; k < rowNum;k++) {
            matrix[k][j] = 0;
          }
          for (int k = 0; k < colNum;k++) {
            matrix[i][k] = 0;
          }
        }
      }
    }
  }
  
  
  //n^2
  private void setZeroRow(int[][] matrix, int row) {
    for (int j=0; j < matrix[0].length; j++) {
      matrix[row][j] = 0;
    }
  }
  
  private void setZeroCol(int[][] matrix, int col) {
    for (int i = 0; i < matrix.length; i++) {
      matrix[i][col] = 0;
    }
  }
  
  public void setZeroes(int[][] matrix) {
    boolean rowHasZero = false;
    boolean colHasZero = false;
    
    //check first row has 0 or not
    for (int j = 0; j < matrix[0].length;j++) {
      if (matrix[0][j] == 0) {
        rowHasZero = true;
        break;
      }
    }
    
    //Check if first column has a zero
    for (int i = 0; i < matrix.length; i++) {
      if (matrix[i][0] == 0) {
        colHasZero = true;
        break;
      }
    }
    
    for (int i = 1; i < matrix.length; i++) {
      for (int j = 1; j < matrix[0].length;j++) {
        if (matrix[i][j] == 0) {
          matrix[i][0] = 0;
          matrix[0][j] = 0;
        }
      }
    }
    
    for (int i =1; i < matrix.length; i++) {
      if (matrix[i][0] == 0) {
        setZeroRow(matrix, i);
      }
    }
    
    for (int j = 0; j < matrix[0].length; j++) {
      if (matrix[0][j] == 0) {
        setZeroCol(matrix, j);
      }
    }
    
    if(rowHasZero) setZeroRow(matrix, 0);
    if(colHasZero) setZeroCol(matrix, 0);
  }
  
  public static void main(String[] args) {
    int[][] matrix = {new int[] {1,1,1,1},
                      new int[] {1,0,1,1},
                      new int[] {1,1,1,1}};
    ZeroMatrix app = new ZeroMatrix();
    app.setZeroes(matrix);
    System.out.println("");
  }
  
}
