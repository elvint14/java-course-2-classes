package org.course.part02.lesson19.lesson.static_and_nonstatic;

public class Student {
  // global - static variable:
  public static int count = 0;

  // fields - instance variable:
  public String name;
  public int age;

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }
}