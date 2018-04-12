package com.dang.ctci.arr;

public class RotateMatrix {
  
  public void rotate(int[][] matrix) {
    int n = matrix.length;
    for (int layer = 0; layer < n/2; layer++) {
      int first = layer;
      int last = n - 1 - layer;
      for (int i = first; i < last; i++) {
        int offset = i - first;
        int temp = matrix[first][i];//save value of top element
        //left -> top:
        matrix[first][i] = matrix[last-offset][first];
        //bottom -> left:
        matrix[last-offset][first] = matrix[last][last-offset];
        //right -> bottom
        matrix[last][last-offset] = matrix[i][last];
        //top -> right
        matrix[i][last] = temp;
      }
    }
  }
  
}
