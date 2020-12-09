package org.course.lesson08.lesson;

import java.util.Scanner;

public class ProblemSolving {
  public static void main1(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int n = in.nextInt();

    for (int i = 0; i <= n; i++) {
      if (i % 2 == 0) System.out.println(i + " is EVEN");
      else System.out.println(i + " is ODD");
    }

  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int n = in.nextInt();

    // 12345 => 1 + 2 + 3 + 4 + 5 = 15

    int sum = 0;
    int prod = 1;
    while (n > 0) {
//      System.out.println("Sum is: " + sum + " and prod is: " + prod + " and n is: " + n);
      int lastDigit = n % 10;
      sum += lastDigit;
      prod *= lastDigit;
      n /= 10;
//      System.out.println("Sum is: " + sum + " and prod is: " + prod + " and n is: " + n);
//      System.out.println("---------");
    }

    System.out.println("SUM of digits is: " + sum);
    System.out.println("PRODUCT of digits is: " + prod);

  }
}