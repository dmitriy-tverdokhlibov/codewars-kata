package com.codewars.kata7kyu;

public class BitsOfInteger {
  public static int reverse_bits(int n) {
    StringBuilder stringBuilder = new StringBuilder();
    String string = Integer.toBinaryString(n);
    char[] resultarray = string.toCharArray();

    for (int i = resultarray.length - 1; i >= 0; i--) {
      stringBuilder.append(resultarray[i]);
    }

    String resultStr = stringBuilder.toString();
    int res = Integer.parseInt(resultStr, 2);
    return res;
  }
}
