package org.course.oop.lesson24.lesson;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LoginRegisterApp {
  /*
      user choose:
        1-        login
        2-        register
        default-  exception
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int menuNum = sc.nextInt();
    switch (menuNum) {
      case 1:
        try {
          login();
        } catch (UsernameNotFoundException e) {
          e.printStackTrace();
        }
        break;
      case 2:
        register();
        break;
      default:
        throw new MenuNotFoundException("Bele menyu movcud deyil!!!");
    }
  }

  /**
   * method for login
   * @return int
   */
  private static int login() throws UsernameNotFoundException {
    Scanner scanner = new Scanner(System.in);
    String username = scanner.next();
    if (!username.equals("elvin")) {
      throw new UsernameNotFoundException("Bele username movcud deyil!!!");
    } else {
      System.out.println("Logged in successfully...");
    }
    return 1;
  }

  private static void register() {
    Scanner scanner = new Scanner(System.in);
    try {
      int age = scanner.nextInt();
    } catch (InputMismatchException e) {
      System.out.println("Yashi duzgun daxil edin!!!!");
    }
  }
}