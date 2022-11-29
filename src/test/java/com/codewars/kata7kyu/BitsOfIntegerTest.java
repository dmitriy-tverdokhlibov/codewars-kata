package com.codewars.kata7kyu;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BitsOfIntegerTest {
  @Test
  public void fixedTests() {
    assertEquals(BitsOfInteger.reverse_bits(417), 267);
    assertEquals(BitsOfInteger.reverse_bits(267), 417);
    assertEquals(BitsOfInteger.reverse_bits(0), 0);
    assertEquals(BitsOfInteger.reverse_bits(2017), 1087);
    assertEquals(BitsOfInteger.reverse_bits(1023), 1023);
    assertEquals(BitsOfInteger.reverse_bits(1024), 1);
  }
}