package org.course.oop.lesson19.hw;

import java.util.Scanner;

public class SnakeApp {
  public static void main(String[] args) {
    int n = new Scanner(System.in).nextInt();

    int count = 1;
    for (int row = 0; row < n; row++) {

      if (row % 2 == 1) {
        int reverse = 2 * (count - 1);
        for (int col = 0; col < n; col++) {
          System.out.print(reverse-- + "\t");
        }
      } else {
        for (int col = 0; col < n; col++) {
          System.out.print(count++ + "\t");
        }
      }
      System.out.println();
    }

  }
}