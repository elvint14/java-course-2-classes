package org.course.basic.lesson15.hw;

import java.util.Scanner;

public class CityNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    System.out.println((n % 2) == (m % 2) ? 1 : 0);
  }
}