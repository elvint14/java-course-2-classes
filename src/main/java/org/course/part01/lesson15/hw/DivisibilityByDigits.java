package org.course.part01.lesson15.hw;

import java.util.Scanner;

public class DivisibilityByDigits {
  public static void main(String[] args) {
    int num = new Scanner(System.in).nextInt();
    System.out.println(isDivisible(num));
  }

  public static String isDivisible(int num) {
    int temp = num;
    for (int i = 0; i < 4; i++) {
      int lastDigit = temp % 10;
      if ((lastDigit == 0) || (num % lastDigit != 0)) return "NO";
      temp = temp / 10;
    }
    return "YES";
  }
}