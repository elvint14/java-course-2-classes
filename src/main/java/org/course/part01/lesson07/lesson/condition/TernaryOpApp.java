package org.course.part01.lesson07.lesson.condition;

import java.util.Scanner;

public class TernaryOpApp {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter your grade: ");
    double grade = in.nextDouble();

    String result = (grade > 50) ? "Passed" : "Failure";

    System.out.println("Your result is: " + result);
  }
}
