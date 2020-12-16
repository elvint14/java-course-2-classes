package org.course.basic.lesson10.lesson;

import java.util.Scanner;

public class MethodApp {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    // WRITE ONCE, RUN EVERYWHERE

    // 1. ededi gotur
    // 2. 10-a bolunub-bolunmediyini yoxla
    // 3. ekrana uygun cavabi cixart

    int n1 = in.nextInt();
    bolunurmu10a(n1);

    int n2 = in.nextInt();
    bolunurmu10a(n2);

    int n3 = in.nextInt();
    bolunurmu10a(n3);

  }

  public static void bolunurmu10a(int eded) {
    // re-usability
    if (eded % 10 == 0) System.out.println("10-a tam bolunur.");
    else                System.out.println("10-a tam bolunMUR.");
  }


  public static void main1(String[] args) {
    print();
    printName("Elvin");
    printName("Eli");
    printName("Rovsen");
  }

  // bezekli (curly) moterizeye qeder olan hisse  - HEAD
  // bezekli (curly) moterizeye daxili olan hisse - BODY
  public static void print() {
    System.out.println("Hello, World!");
  }

  public static void printName(String name) {
    System.out.println("Hello, " + name);
  }

}