package org.course.basic.lesson13.hw.e_olymp;

import java.util.Scanner;

public class SgnFunctionApp {
  public static void main(String[] args) {
    int x = new Scanner(System.in).nextInt();
    byte result;

    if (x > 0)       result = 1;
    else if (x == 0) result = 0;
    else             result = -1;

    System.out.println(result);
  }
}
