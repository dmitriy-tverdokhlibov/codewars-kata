package com.codewars.kata8kyu;

public class SmashWords {
  public static String smash(String... words) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < words.length; i++) {
      if (i + 1 >= words.length) {
        sb.append(words[i]);
        break;
      }
      sb.append(words[i]).append(" ");
    }

    return sb.toString();
  }
}
