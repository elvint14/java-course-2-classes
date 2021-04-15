package org.course.part01.lesson15.hw;

import java.util.Scanner;

public class ConditionalStatement1 {
  public static void main(String[] args) {
    int x = new Scanner(System.in).nextInt();
    if (x < 5) System.out.println(x * x - 3 * x + 4);
    else System.out.println(x + 7);
  }
}