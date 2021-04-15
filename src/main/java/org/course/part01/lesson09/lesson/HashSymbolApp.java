package org.course.part01.lesson09.lesson;

import java.util.Scanner;

public class HashSymbolApp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter symbol: ");
    String symbol = sc.next();
    System.out.print("Enter num: ");
    int n = sc.nextInt();

    for (int row = 1; row <= n; row++) {
      for (int col = 1; col <= row; col++) {
        System.out.print(symbol);
      }
      System.out.println();
    }
    /*
   #
   ##
   ###
   ####
   #####
    */
  }
}