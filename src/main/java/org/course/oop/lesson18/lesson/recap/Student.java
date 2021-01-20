package org.course.oop.lesson18.lesson.recap;

public class Student {
  String name;
  double grade;

  // alt + insert
  public Student(String name, double grade) {
    this.name = name;
    this.grade = grade;
  }

  public double getPercent() {
    return this.grade / 100;
  }
}
