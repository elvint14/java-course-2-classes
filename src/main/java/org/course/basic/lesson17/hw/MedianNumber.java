package org.course.basic.lesson17.hw;

import java.util.Scanner;

public class MedianNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    if (a > b && c > a) System.out.println(a);      // c > a > b, c < a < b
    else if (b > a && b < c) System.out.println(b); // c > b > a, c < b < a
    else System.out.println(c);
  }
}