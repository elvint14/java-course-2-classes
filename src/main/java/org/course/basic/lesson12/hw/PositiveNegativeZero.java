package org.course.basic.lesson12.hw;

import java.util.Scanner;

public class PositiveNegativeZero {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    if (a > 0)
      System.out.println("Positive");
    else if (a == 0)
      System.out.println("Zero");
    else
      System.out.println("Negative");
  }
}