package org.course.basic.lesson14.hw;

import java.util.Scanner;

public class MaxOf4App {
  public static void main(String[] args) {
    Scanner sa = new Scanner(System.in);
    short a = sa.nextShort();
    short b = sa.nextShort();
    short c = sa.nextShort();
    short d = sa.nextShort();
    System.out.println(Math.max(a, Math.max(b, Math.max(c, d))));
  }
}















