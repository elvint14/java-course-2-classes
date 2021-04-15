package org.course.part01.lesson08.lesson;

import java.util.Scanner;

public class WhileLoopApp {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int numForloop = num;

    while (num <= 5) {
      System.out.print(num + " -!- ");
      num++; // num = num - 1;
    }

    System.out.println("\nnum is: " + num);
    System.out.println("numForLoop is: " + numForloop);

    System.out.println("----------");

    for ( ; numForloop <= 5; numForloop++) {
      System.out.print(numForloop + " -!- ");
    }

    System.out.println("numForLoop is: " + numForloop);


  }
}