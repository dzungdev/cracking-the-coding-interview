package com.dang.ctci.recursion;

public class TripleStep {

  public int recursionWayCount(int n) {
    if (n < 0) {
      return 0;
    } else if (n == 0) {
      return 1;
    } else {
      return recursionWayCount(n - 1) + recursionWayCount(n - 2) + recursionWayCount(n - 3);
    }
  }

  /**
   * Dynamic Programming bottom up
   * 
   * @param n
   * @return
   */
  public int dpWayCount(int n) {
    if (n == 0 || n == 1)
      return 1;
    if (n == 2)
      return 2;

    int[] memo = new int[n];
    memo[0] = 1;
    memo[1] = 1;
    memo[2] = 2;
    for (int i = 3; i < n; i++) {
      memo[i] = memo[i - 1] + memo[i - 2] + memo[i - 3];
    }

    return memo[n - 1] + memo[n - 2] + memo[n - 3];
  }

  public static void main(String[] args) {
    TripleStep app = new TripleStep();
    System.out.println(app.recursionWayCount(5));
    System.out.println(app.dpWayCount(5));
  }

}
