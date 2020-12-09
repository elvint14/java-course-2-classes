package org.course.lesson08.lesson;

public class DoWhileLoopApp {
  public static void main(String[] args) {

    int n = 6;

    while (n > 5) {
      System.out.println("WHILE => N is: " + n);
    }

    // do-while qarantiya verir ki, minimum 1 defe operations icra olunacaq!
    do {
      System.out.println("DO-WHILE => N is: " + n);
    } while (n > 5);

  }
}