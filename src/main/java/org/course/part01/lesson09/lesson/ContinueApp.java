package org.course.part01.lesson09.lesson;

import java.util.Scanner;

public class ContinueApp {
  public static void main(String[] args) {

    // istifadeci 2 eded daxil edir. Bunlar arasindaki butun cut ededleri cap edin
    // qeyd: eger ededler 4-e tam bolunurlerse, o zaman onlari cap etMEyin.

    // 1, 20 -> 2, 4, 6,  8,  10, 12, 14, 16, 18, 20
    // 1, 20 -> 2, 6, 10, 14, 18,

    Scanner in = new Scanner(System.in);
    System.out.println("Enter first number: ");
    int a = in.nextInt();
    System.out.println("Enter second number: ");
    int b = in.nextInt();

//    for (int i = a; i <= b; i++) {
//      if (i % 2 == 0 && i % 4 != 0) System.out.print(i + " ");
//    }

//    for (int i = a; i <= b; i++) {
//      if (i % 4 == 0) continue;
//      if (i % 2 == 0) System.out.print(i + " ");
//    }

    for (int i = a; i <= b; i++) {
      if (i % 2 == 0) {
        if (i % 4 == 0) continue;
        System.out.print(i + " ");
      }
    }
  }
}