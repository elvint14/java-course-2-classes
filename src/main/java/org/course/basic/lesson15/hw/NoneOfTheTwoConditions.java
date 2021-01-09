package org.course.basic.lesson15.hw;

import java.util.Scanner;

public class NoneOfTheTwoConditions {
  public static void main(String[] args) {
    int n = new Scanner(System.in).nextInt();
    boolean cond1 = n > 0 && n % 2 == 0;
    boolean cond2 = n < 0 && Math.abs(n) % 2 == 1;
    if (!cond1 && !cond2) System.out.println("YES");
    else System.out.println("NO");
  }
}