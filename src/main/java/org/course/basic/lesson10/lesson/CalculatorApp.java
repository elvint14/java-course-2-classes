package org.course.basic.lesson10.lesson;

import java.util.Scanner;

public class CalculatorApp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first number: ");
    double a = sc.nextDouble();

    System.out.print("Enter second number: ");
    double b = sc.nextDouble();

    System.out.println("Sum is: " + sum(a, b));
    System.out.println("Sub is: " + sub(a, b));
    System.out.println("Mul is: " + mul(a, b));
    System.out.println("Div is: " + div(a, b));
    System.out.println("Mod is: " + mod(a, b));

  }

  private static double sum(double a, double b) {
    return a + b;
  }

  private static double sub(double a, double b) {
    return a - b;
  }

  private static double mul(double a, double b) {
    return a * b;
  }

  private static double div(double a, double b) {
    return a / b;
  }

  private static double mod(double a, double b) {
    return a % b;
  }

}
