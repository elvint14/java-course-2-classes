package org.course.part02.lesson21.lesson.wrapper;

public class WrapperTypesApp {
  // global - static
  private static String global_counter;

  // instance
  private int age;

  // local
  void doOp(){
    int a = 0;
    System.out.println(a);
  }

  public static void main(String[] args) {
    System.out.println(WrapperTypesApp.global_counter);

    System.out.println(new WrapperTypesApp().age);
  }
}
