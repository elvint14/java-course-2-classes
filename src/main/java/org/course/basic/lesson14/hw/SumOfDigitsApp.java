package org.course.basic.lesson14.hw;

import java.util.Scanner;

public class SumOfDigitsApp {
  public static void main(String[] args) {
    int n = new Scanner(System.in).nextInt();
    int temp = Math.abs(n);

    System.out.println(n + " -> " + (n % 2));
    System.out.println(temp + " -> " + (temp % 2));

    if ((temp % 2 == 1) || (n > 0 && n > 99 && n < 1000)) System.out.println("YES");
    else System.out.println("NO");
  }
}

//  public static void main1(String[] args) {
//    short num = new Scanner(System.in).nextShort();
//    // 1235 => 1 + 5 = 6
//    System.out.println((num / 1000) + (num % 10));
//  }