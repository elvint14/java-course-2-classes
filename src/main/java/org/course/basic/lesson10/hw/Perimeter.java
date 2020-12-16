package org.course.basic.lesson10.hw;

import java.util.Scanner;

public class Perimeter {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    short a = sc.nextShort();
    short b = sc.nextShort();

    System.out.println(2 * (a + b));
  }
}
