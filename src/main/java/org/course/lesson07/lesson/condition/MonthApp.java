package org.course.lesson07.lesson.condition;

import java.util.Scanner;

public class MonthApp {
  /**
   * istifadeci eded daxil edir.
   * hansi ayin oldugunu konsola cap edin
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Ayin numresini daxil edin: ");
    int num = sc.nextInt();

    if (num < 1 || num > 12) System.out.println("Bele bir teqvim ayi movcud deyil!");
    else if (num == 1)       System.out.println("Yanvar");
    else if (num == 2)       System.out.println("Fevral");
    else if (num == 11)      System.out.println("Noyabr");
    else                     System.out.println("Dekabr");


  }
}