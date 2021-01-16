package org.course.basic.lesson17.hw;

import java.util.Scanner;

public class BypassMatrixWithSnake {
  public static void main(String[] args) {
    int n = new Scanner(System.in).nextInt();
    int counter = 1;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(counter++ + "\t");
      }
      System.out.println();
    }

  }
}
