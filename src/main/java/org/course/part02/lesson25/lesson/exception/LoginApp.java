package org.course.part02.lesson25.lesson.exception;

public class LoginApp {
  public static void main(String[] args) {
    String name = "Elvin";

    boolean isCorrect;

//    try {
      isCorrect = login(name);
//    } catch (RuntimeException e) {
//      isCorrect = false;
//    }

    System.out.println(isCorrect ? "Welcome" : "Wrong name");
  }

  private static boolean login(String name) throws RuntimeException {
    if (name.equals("basjda")) return true;
    else throw new RuntimeException("Wrong name entered!");
  }
}