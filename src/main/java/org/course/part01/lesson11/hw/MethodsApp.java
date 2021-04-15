package org.course.part01.lesson11.hw;

import java.util.Scanner;

public class MethodsApp {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      int qiymet = tesadufuEdedGetir();
      boolean netice = cutdurmu(qiymet);
      capEtMentiqi(qiymet, netice);
    }


  }

  /**
   * first kind of methods: `no param.` & `no return`
   */
  public static void capEt() {
    System.out.println("Hello, World!");
    System.out.println("This is a for-loop with methods.");
  }

  /**
   * second kind of methods: `1 param.` & `no return`
   */
  public static void capEtIndex(int index) {
    System.out.println(index + ". Hello, World!");
  }

  /**
   * second kind of methods: `2 param.` & `no return`
   */
  public static void capEtMentiqi(int eded, boolean netice) {
    System.out.println(eded + " ededi cutdurmu: " + netice);
  }

  /**
   * third kind of methods: `no param.` & `integer return type`
   */
  public static int tesadufuEdedGetir() {
    double generatedValue = Math.random() * 100;
    int castedValue = (int) generatedValue;
//    System.out.println("Double value is: " + generatedValue);
//    System.out.println("Int value is: " + castedValue);
    return castedValue;
  }

  /**
   * fourth kind of methods: `1 param.` & `boolean return type`
   */
  public static boolean cutdurmu(int qiymet) {
    if (qiymet % 2 == 0) return true;
    else return false;
  }
}