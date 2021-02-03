package org.course.oop.lesson22.lesson.casting;

public class WrapperTypesApp {
  private static int global; // global var.
  private static boolean isExpired;
  private static Integer globalRef;
  private static Boolean isLocked;

  public static void main(String[] args) {

    int local = 9; // local var.

    System.out.println(global);
    System.out.println(isExpired);
    System.out.println(globalRef);

    System.out.println(isLocked.booleanValue());




  }
}
