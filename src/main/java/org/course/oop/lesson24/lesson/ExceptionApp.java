package org.course.oop.lesson24.lesson;

import java.util.Scanner;

public class ExceptionApp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter 1st num: ");
    int first = sc.nextInt();
    System.out.print("Enter 2nd num: ");
    int second = sc.nextInt();

    while (second == 0) {
      System.out.println("Bolunen sifir ola bilmez! Yeniden daxil edin!!!");
      second = sc.nextInt();
    }

    System.out.println(first / second);

    System.out.println("Operation finished successfully...");

    /*

    source code ---compiling--> byte code -> binary (run): exceptions

     */

  }
}
