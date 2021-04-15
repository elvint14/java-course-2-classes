package org.course.part01.lesson08.lesson;

import java.util.Scanner;

public class ForLoopApp {
  public static void main1(String[] args) {


//          (1)       (2)    (4)
    for (int i = 1; i <= 5; i++) {
//      (3)
      System.out.println("i is: " + i);
    }

    /*
    1st period:
        (1)  `i = 1`
        (2)  i <= 5 ? => 1 <= 5 => `true`
        (3)  System.out.println("i is: " + 1); => `i is: 1`
        (4)  i++ => i = i + 1 => `i = 2`
    2nd period:
        (1)  `i = 2`
        (2)  i <= 5 ? => 2 <= 5 => `true`
        (3)  System.out.println("i is: " + 2); => `i is: 2`
        (4)  i++ => i = i + 1 => `i = 3`
    3rd period:
        (1)  `i = 3`
        (2)  i <= 5 ? => 3 <= 5 => `true`
        (3)  System.out.println("i is: " + 3); => `i is: 3`
        (4)  i++ => i = i + 1 => `i = 4`
    4th period:
        (1)  `i = 4`
        (2)  i <= 5 ? => 4 <= 5 => `true`
        (3)  System.out.println("i is: " + 4); => `i is: 4`
        (4)  i++ => i = i + 1 => `i = 5`
    5th period:
        (1)  `i = 5`
        (2)  i <= 5 ? => 5 <= 5 => `true`
        (3)  System.out.println("i is: " + 5); => `i is: 5`
        (4)  i++ => i = i + 1 => `i = 6`
    6th period:
        (1)  `i = 6`
        (2)  i <= 5 ? => 6 <= 5 => `false`
        (3)  exit from loop
     */
  }

  public static void main2(String[] args) {
//    for (int i = 0; i < 10; i++) {
//      System.out.print("i is: " + i + " | ");
//    }

    System.out.println();

    for (int i = 100; i >= 0; i--) {
      if (i % 7 == 0) System.out.print(i + " | ");
    }

  }

  public static void main3(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();

    int sum = 0;
    for (int i = 0; i < n; i++) {
      sum = sum + i; // sum += i;
      System.out.println("i is: " + i + " and sum is: " + sum);
    }

    System.out.println("Sum is: " + sum);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();

    // factorial: 1-den edede kimi butun ededlerin hasili:
    int factorial = 1;
    for (int i = 1; i <= n; i++) {
      factorial = factorial * i; // factorial *= i;
      System.out.println("factorial is: " + factorial);
    }

    System.out.println("Factorial of " + n + " is: " + factorial);
  }
}