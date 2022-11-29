package com.codewars.kata8kyu;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SquareSumTest {
  @Test
  public void testBasic()
  {
    assertEquals(9, SquareSum.squareFunction(new int[] {1,2,2}));
    assertEquals(5, SquareSum.squareFunction(new int[] {1,2}));
    assertEquals(50, SquareSum.squareFunction(new int[] {5,-3,4}));
    assertEquals(0, SquareSum.squareFunction(new int[] {}));
  }
}