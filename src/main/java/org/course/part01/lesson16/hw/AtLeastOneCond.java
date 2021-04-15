package org.course.part01.lesson16.hw;

import java.util.Scanner;

public class AtLeastOneCond {
  public static void main(String[] args) {
    int n = new Scanner(System.in).nextInt();
    System.out.println(Math.abs(n) % 2 == 1);
    if ((Math.abs(n) % 2 == 1) || (n > 0 && n > 99 && n < 1000)) System.out.println("YES");
    else System.out.println("NO");
  }
}
