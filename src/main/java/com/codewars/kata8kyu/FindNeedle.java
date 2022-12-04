package com.codewars.kata8kyu;

public class FindNeedle {
  public static String findNeedle(Object[] haystack) {
    int index = 0;
    for (int i = 0; i < haystack.length; i++) {
      if ("needle".equals(haystack[i])) {
        index = i;
      }
    }
    return "found the needle at position " + index;
  }
}
