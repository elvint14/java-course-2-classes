package org.course.basic.lesson11.hw;

import java.util.Scanner;

/**
 * https://www.w3resource.com/java-exercises/method/index.php
 */
public class AverageApp {
  public static void main(String[] args) {
    double a = inputNumber();
    double b = inputNumber();
    double c = inputNumber();

    double avg = calcAverage(a, b, c);

    printResult(a, b, c, avg);
  }

  public static double inputNumber() {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a number: ");
    return in.nextDouble();
  }

  public static double calcAverage(double x, double y, double z) {
    return (x + y + z) / 3;
  }

  public static void printResult(double x, double y, double z, double avg) {
    System.out.println("Average of " + x + ", " + y + " and " + z + " equals to " + avg);
  }
}