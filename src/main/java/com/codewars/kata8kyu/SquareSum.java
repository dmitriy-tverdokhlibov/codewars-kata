package com.codewars.kata8kyu;

public class SquareSum {
  public static int squareFunction(int[] n) {
    int sum = 0;
    for (int i = 0; i < n.length; i++) {
      sum += n[i] * n[i];
    }
    return sum;
  }
}
