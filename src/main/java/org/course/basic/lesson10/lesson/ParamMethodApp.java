package org.course.basic.lesson10.lesson;

public class ParamMethodApp {
  public static void main(String[] args) {
    print();
    print();
    print();
    printName("Elvin");
    printName("Eli");
    printName("Rovsen");
    printMultBy5(100);
    printMultBy5(-80);
    printNameAgeBool("Elvin", 21, true);
    printNameAgeBool("Rovsen", 20, false);
  }

  public static void print() {
    System.out.println("Hello, World!");
  }

  public static void printName(String name) {
    System.out.println("Hello, " + name);
  }

  public static void printMultBy5(int number) {
    System.out.println("Number is: " + number + " and " + number + "x5 = " + (number * 5));
  }

  public static void printNameAgeBool(String name, int age, boolean bool) {
    System.out.println("Hello, my name is " + name + ". I am " + age + " years old!");
    System.out.println(bool ? 100 : -100);
  }

}