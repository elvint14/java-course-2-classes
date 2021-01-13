package org.course.basic.lesson16.hw;

import java.util.Scanner;

public class FirstOrLast {
  public static void main(String[] args) {
    int num = new Scanner(System.in).nextInt();

    int first = num / 100;
    int last = num % 10;

    if (first == last) System.out.println("=");
    else System.out.println(Math.max(first, last));
  }
}
