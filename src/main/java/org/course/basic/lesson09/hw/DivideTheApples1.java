package org.course.basic.lesson09.hw;

import java.util.Scanner;

public class DivideTheApples1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int k = sc.nextInt();

    System.out.println(k / n);
  }
}