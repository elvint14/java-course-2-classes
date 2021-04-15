package org.course.part01.lesson13.hw.e_olymp;

import java.util.Scanner;

public class PreviousOddNumberApp {
  public static void main(String[] args) {

    int num = new Scanner(System.in).nextInt();

    if (num % 2 == 0) System.out.println(num - 1);
    else System.out.println(num - 2);

  }
}