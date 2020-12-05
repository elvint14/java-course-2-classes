package org.course.lesson07.lesson.user_input;

import java.util.Scanner;

public class InputApp {
  public static void main1(String[] args) {

    int age = 21; // variable: declare and initialize
    System.out.println("Mənim yaşım: " + age);

    // + -> arithmetic    op.
    // + -> concatenation op.

  }

  /**
   * Belə bir sistem tapşırığı verilib:
   * istifadəçi yaşını daxil edir
   * proqram yaşını konsola çap edir.
   */
  public static void main2(String[] args) {
    // input
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your age: ");
    int age = sc.nextInt();

    // output
    System.out.println("My age is: " + age);
  }

  /**
   * Belə bir sistem tapşırığı verilib:
   * istifadəçi yaşını və adını daxil edir
   * proqram yaşını və adını konsola çap edir.
   */
  public static void main3(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter your age: ");
    int age = input.nextInt();

    System.out.print("Enter your name: ");
    String name = input.next();

    System.out.println("My name is " + name + " and I am " + age + " years old!");
  }

  /**
   * Istifadeci ad ve soyadini daxil edir.
   * Konsola onlari cap edin.
   */
  public static void main4(String[] args) {


    /*
      1. Scanner obyekti yarat!
      2. Onunla daxil etmek istediyin data type-i sech
      3. Prosesleri icra et!
     */

    Scanner scanner = new Scanner(System.in);

    // Elvin Taghizade
    System.out.println("Enter your full name:");
    String fullName = scanner.nextLine();

    // next()     -> ilk boshluga kimi olan hisseni goturur!
    // nextline() -> butun her sheyi goturur!

    System.out.println("My full name is: " + fullName);
  }
}