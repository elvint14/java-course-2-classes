package org.course.basic.lesson07.lesson.user_input;

import java.util.Scanner;

public class CalculatorApp {
  public static void mainV1(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter first number: ");
    double a = input.nextDouble();

    System.out.print("Enter second number: ");
    double b = input.nextDouble();

    System.out.println("Add. is: " + (a + b));
    System.out.println("Sub. is: " + (a - b));
    System.out.println("Mul. is: " + (a * b));
    System.out.println("Div. is: " + (a / b));
    System.out.println("Mod. is: " + (a % b));
  }

  public static void mainV2(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter first number: ");
    double a = input.nextDouble();

    System.out.print("Enter second number: ");
    double b = input.nextDouble();

    double sum = a + b;
    double sub = a - b;
    double mul = a * b;
    double div = a / b;
    double mod = a % b;

    System.out.println("Add. is: " + sum);
    System.out.println("Sub. is: " + sub);
    System.out.println("Mul. is: " + mul);
    System.out.println("Div. is: " + div);
    System.out.println("Mod. is: " + mod);
  }
}