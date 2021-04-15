package org.course.part01.lesson15.hw;

import java.util.Scanner;

public class EachConditionOfTwo {
  public static void main(String[] args) {
    int n = new Scanner(System.in).nextInt();
    int pos = Math.abs(n);
    if (n % 3 == 0 && n % 2 == 0 && pos > 9 && pos < 100) System.out.println("YES");
    else System.out.println("NO");
  }
}