package org.course.oop.lesson20.lesson.inheritance._before;

public class Student {
  private String name;
  private String surname;
  private int age;
  private double grade;

  public Student(String name, String surname, int age, double grade) {
    this.name = name;
    this.surname = surname;
    this.age = age;
    this.grade = grade;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public double getGrade() {
    return grade;
  }

  public void setGrade(double grade) {
    this.grade = grade;
  }

  @Override
  public String toString() {
    return String.format("Student[name='%s', surname='%s', age=%d, grade=%s]", name, surname, age, grade);
  }
}