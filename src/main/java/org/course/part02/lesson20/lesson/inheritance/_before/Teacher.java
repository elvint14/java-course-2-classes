package org.course.part02.lesson20.lesson.inheritance._before;

public class Teacher {
  private String name;
  private String surname;
  private int age;
  private double salary;

  public Teacher(String name, String surname, int age, double salary) {
    this.name = name;
    this.surname = surname;
    this.age = age;
    this.salary = salary;
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

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return String.format("Teacher[name='%s', surname='%s', age=%d, salary=%s]", name, surname, age, salary);
  }
}
