package org.course.oop.lesson18.hw;

import java.util.Scanner;

public class RectangleApp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    // n*m -> n=row, m=column
    int counter = 1;
    for (int row = 0; row < n; row++) {

      if (row%2==0) {
        // TODO from left to right
      } else {
        // TODO from right to left
      }
      System.out.println();
    }
  }
}