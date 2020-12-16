package org.course.basic.lesson10.lesson;

/**
 * https://www.w3resource.com/java-exercises/method/index.php
 */
public class W3SchoolExercisesApp {
  public static void main(String[] args) {

    System.out.println(findSmallest3(1, 2, 3));
    System.out.println(calcAreaSquare(10.0));

  }

  public static int findSmallest3(int a, int b, int c) {
    return Math.min(a, Math.min(b, c));
  }

  public static double calcAreaSquare(double side) {
    return side * side;
//    return Math.pow(side, 2);
  }
}
