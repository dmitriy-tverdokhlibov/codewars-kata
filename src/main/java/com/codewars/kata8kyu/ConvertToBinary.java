package com.codewars.kata8kyu;

import java.util.Stack;

public class ConvertToBinary {

  public static int toBinary(int n) {
    StringBuilder sb = new StringBuilder();
    Stack<Integer> stack = new Stack<>();
    int bal;

    while (n != 0) {
      bal = n % 2;
      stack.push(bal);
      n = n / 2;
    }

    for (int i : stack) {
      sb.append(i);
    }

    sb.reverse();
    int res = Integer.parseInt(sb.toString());
    return res;
  }
}
