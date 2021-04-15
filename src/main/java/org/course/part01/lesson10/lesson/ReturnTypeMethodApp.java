package org.course.part01.lesson10.lesson;

public class ReturnTypeMethodApp {
  public static void main(String[] args) {

    // method-a eded verilir
    // method hemin ededin cut ve ya tek olmasini yoxlayib
    // bize eger cutdurse, ededi 5-e vurub, tekdirse, 2-ye vurub qaytarsin.

    int a = 10;
    int b = 15;

    print("Operation started...");
    int resultA = check(a);
    int resultB = check(b);
    System.out.println(resultA);
    System.out.println(resultB);
    print("Operation finished successfully...");
  }

  public static int check(int num) {
    if (num % 2 == 0) return (num * 5);
    else return (num * 2);
  }

  public static void print(String infoMessage) {
    System.out.println(infoMessage);
  }
}