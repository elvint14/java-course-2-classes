package org.course.part02.lesson20.lesson.inheritance.after;

public class Student extends Human {
  private double grade;

  public Student(String name, String surname, int age, double grade) {
    super(name, surname, age);
    this.grade = grade;
  }

  public double getGrade() {
    return grade;
  }

  public void setGrade(double grade) {
    this.grade = grade;
  }

  public void giveFinalExam() {
    System.out.println("Final exam given successfully!");
  }

  @Override
  public String toString() {
    return String.format("Student[name='%s', surname='%s', age=%d, grade=%s]",
            super.getName(), super.getSurname(), super.getAge(), this.grade);
  }
}