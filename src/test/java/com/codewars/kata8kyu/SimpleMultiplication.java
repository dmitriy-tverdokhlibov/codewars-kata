package com.codewars.kata8kyu;

public class SimpleMultiplication {
  public static int simpleMultiplication(int n) {
    int res = n % 2 == 0 ? (n * 8) : (n * 9);
    return res;
  }
}
