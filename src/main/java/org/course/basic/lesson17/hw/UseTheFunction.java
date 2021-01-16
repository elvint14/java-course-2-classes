package org.course.basic.lesson17.hw;

import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class UseTheFunction {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double x = sc.nextDouble();
    double y = sc.nextDouble();
    double z = sc.nextDouble();

    double result = findMin(x, y, z);

    System.out.printf("%.2f", result);
  }

  private static double findMin(double x, double y, double z) {
    //  min(max(x,y), max(y,z), x+y+z)
    return min(
            min(max(x, y), max(y, z)),
            x + y + z
    );
  }
}