package org.course.part02.lesson21.lesson.overriding;

public class OverrideApp {
  public static void main(String[] args) {

    int[] ints = new int[10];
    System.out.println(ints.toString());

    Engineer elvin = new Engineer("Elvin", "Taghizade", 21, "IT");
    System.out.println(elvin.toString());

    elvin.goHome();

  }
}
