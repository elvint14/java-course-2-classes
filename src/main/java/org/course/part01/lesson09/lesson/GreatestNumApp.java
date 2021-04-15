package org.course.part01.lesson09.lesson;

import java.util.Scanner;

public class GreatestNumApp {
  public static void main(String[] args) {
//    Take three numbers from the user and print the greatest number
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first num: ");
    int a = sc.nextInt();
    System.out.print("Enter second num: ");
    int b = sc.nextInt();
    System.out.print("Enter third num: ");
    int c = sc.nextInt();

    int max = Math.max(a, Math.max(b, c));
    int min = Math.min(a, Math.min(b, c));

    System.out.println(max);
    System.out.println(min);
  }
}