package com.ymmihw.aaaaaaaaaaaaa;

import java.util.Arrays;

public class InliningExample {

  public static final int NUMBERS_OF_ITERATIONS = 15000;

  public static void main(String[] args) {
    // for (int i = 1; i < NUMBERS_OF_ITERATIONS; i++) {
    // calculateSum(i);
    // }

    byte[] bytes = "我".getBytes();
    System.out.println(Arrays.toString(bytes));
  }

  private static long calculateSum(int n) {
    return new ConsecutiveNumbersSum(n).getTotalSum();
  }
}
