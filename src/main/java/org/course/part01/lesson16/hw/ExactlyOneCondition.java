package org.course.part01.lesson16.hw;

import java.util.Scanner;

public class ExactlyOneCondition {
  public static void main(String[] args) {
    int n = new Scanner(System.in).nextInt();
    if ((n % 2 == 0) != (n < 0 && n % 3 == 0)) System.out.println("YES");
    else System.out.println("NO");
  }
}