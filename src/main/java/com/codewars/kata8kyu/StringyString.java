package com.codewars.kata8kyu;

public class StringyString {
  public static String stringy(int size) {
    if (size == 0) {
      return "1";
    }

    StringBuilder stringBuilder = new StringBuilder();
    boolean flag = true;
    for (int i = 0; i < size; i++) {
      if (flag) {
        stringBuilder.append(1);
        flag = false;
      } else {
        stringBuilder.append(0);
        flag = true;
      }
    }
    return stringBuilder.toString();
  }
}
