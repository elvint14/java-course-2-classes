package org.course.basic.lesson09.lesson;

import java.util.Scanner;

public class BreakApp {
  public static void main(String[] args) {

    /*
      Istifadeci eded daxil edir. Daxil etdiyi ededden etibaren
      ilk 7-ye bolune bilen ededi tapin:
        15 -> 21
        14 -> 14
    */

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = sc.nextInt();

    /*
    int count = 0;
    while (true) {
      if (num % 7 == 0) {
        System.out.println("Number " + num + " can be divide by 7");
        count++;
      }
      if (count == 3) break;
      num++;
    }
     */

    System.out.println("-----------");

    for (int alma = 1; alma <= 3; num++) {
      if (num % 7 == 0) {
        System.out.println("Number " + num + " can be divide by 7");
        alma++;
      }
    }
  }
}