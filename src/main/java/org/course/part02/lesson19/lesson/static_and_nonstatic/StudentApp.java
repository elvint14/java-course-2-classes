package org.course.part02.lesson19.lesson.static_and_nonstatic;

public class StudentApp {
  static int myCount = 0;

  public static void main(String[] args) {
    System.out.println(Student.count);

    Student elvin1 = new Student("Elvin", 21);
    elvin1.name = "ABCDE";
    System.out.println(elvin1.name);
    System.out.println(elvin1.age);
    Student.count = 1;
    System.out.println(Student.count);

    Student elvin2 = new Student("Elvin", 21);
    System.out.println(elvin2.name);
    System.out.println(elvin2.age);
    System.out.println(++Student.count);
  }

  public static void print(int[] array) {
    int sum = 0; // local variables
    for (int i = 0; i < 10; i++) {

    }
  }
}
