package org.course.part02.lesson18.lesson.overloading;

public class OverloadingApp {
  public static void main1(String[] args) {
    System.out.println(sum(1, 2));
    System.out.println(sum(1, 2, 3));
    System.out.println(sum(1.2, 2.0));
  }

  public static void main2(String[] args) {
    print("Elvin");
    print(21, "Elvin");
    print("Elvin", 21);
    print("Elvin", "Taghizade");
  }

  public static void main(String[] args) {
    int maxOfInts       = Math.max(1, 2);
    double maxOdDoubles = Math.max(1.4, 2.3);
  }

  public static int sum(int a, int b) {
    return a + b;
  }

  public static int sum(int a, int b, int c) {
    return a + b + c;
  }

  public static double sum(double a, double b) {
    return a + b;
  }

  public static void print(String name) {
    System.out.println(name);
  }

  public static void print(int age, String name) {
    System.out.println(age + name);
  }

  public static void print(String name, int age) {
    System.out.println(age + name);
  }

  public static void print(String name, String surname) {
    System.out.println(name + surname);
  }

}