package org.course.part02.lesson20.lesson.gc;

public class GarbageCollectorApp {
  public static void main(String[] args) {

    Person elvin = new Person("Elvin", 21);
    System.out.println(elvin);

    elvin = new Person("Elvin", 22);
    System.out.println(elvin);

    String name = "A";
    name = "B";

  }
}
