package org.course.part02.lesson24.lesson;

import java.util.Scanner;

public class HandlingExceptionApp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter 1st num: ");
    int first = sc.nextInt();
    System.out.print("Enter 2nd num: ");
    int second = sc.nextInt();


    try {
      System.out.println(first / second);
    } catch (ArithmeticException e) {
//      e.printStackTrace();
      System.out.println("Sifira bolmek olmaz: " + e.getMessage());
    }

    System.out.println("Operation finished successfully...");


  }
}