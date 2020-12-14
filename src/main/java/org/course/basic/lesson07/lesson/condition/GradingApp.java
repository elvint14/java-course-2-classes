package org.course.basic.lesson07.lesson.condition;

import java.util.Scanner;

public class GradingApp {
  public static void main1(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();


    if (num == 99) {
      System.out.println("Salam, Dunya!");
    }

  }

  public static void main2(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();


    // eger       (if)   eded 10-dursa, konsola => "Salam"  cap et!
    // eks halda  (else) konsole => "Sag ol" cap et!
    if (num == 10) {
      System.out.println("Salam");
    }
    else {
      System.out.println("Sag ol");
    }


  }

  public static void main(String[] args) {
    // A,   B,   C,   D,   E,   F
    // 91+, 81+, 71+, 61+, 51+, 50-
    // < 0 || > 100
    Scanner in = new Scanner(System.in);

    System.out.print("Enter your grade: ");
    double grade = in.nextDouble();

    if (grade > 100 || grade < 0) {
      System.out.println("You entered wrong grade!");
    }
    else if (grade >= 91) {
      System.out.println("Your mark is: 'A'");
    }
    else if (grade >= 81) {
      System.out.println("Your mark is: 'B'");
    }
    else if (grade >= 71) {
      System.out.println("Your mark is: 'C'");
    }
    else if (grade >= 61) {
      System.out.println("Your mark is: 'D'");
    }
    else if (grade >= 51) {
      System.out.println("Your mark is: 'E'");
    }
    else {
      System.out.println("Your mark is: 'F'");
    }

  }

}