package org.course.part01.lesson10.lesson;

public class MethodExamplesApp {
  public static void main(String[] args) {

    // void & no-param
    print();
    // void & 1-param
    printMsg("Welcome to Methods in JAVA!");
    // double-type-return & no-param
    double random = getRandom();
    System.out.println(random);
    // double-type-return & 1-param
    double result = add100(random);
    System.out.println(result);

  }

  public static void print() {
    System.out.println("Hello, World!");
  }

  public static void printMsg(String msg) {
    System.out.println(msg);
  }

  public static double getRandom() {
    return Math.random() * 100;  // [0, 100)
  }

  public static double add100(double number) {
    return (number + 100);
  }
}