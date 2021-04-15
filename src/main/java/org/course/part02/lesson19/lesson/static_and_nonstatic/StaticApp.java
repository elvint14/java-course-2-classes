package org.course.part02.lesson19.lesson.static_and_nonstatic;

public class StaticApp {
  static int myInt = 5;

  public static void main(String[] args) {
    int sum = sum(1, 2);
    System.out.println(sum);
    System.out.println(myInt);
  }

  public static int sum(int a, int b) {
    return a + b;
  }
}
