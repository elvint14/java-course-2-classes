package org.course.part02.lesson18.lesson.recap;

public class ManagementApp {
  public static void main(String[] args) {

    Student elvin = new Student("Elvin", 85);
    System.out.println(elvin.name);
    System.out.println(elvin.grade);

    System.out.println(elvin.getPercent());

  }
}
