package com.codewars.kata8kyu;


import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringyStringTest {
  @Test
  public void startTest() {
    assertEquals(1, Integer.parseInt(String.valueOf(StringyString.stringy(3).charAt(0))));
  }

  @Test
  public void lengthTests() {
    Random randGen = new Random();
    for (int i = 0; i < 10; i++) {
      int size = randGen.nextInt(50);
      assertEquals(size, StringyString.stringy(size).length());
    }
  }
}