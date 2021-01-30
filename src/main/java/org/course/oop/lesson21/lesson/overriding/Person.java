package org.course.oop.lesson21.lesson.overriding;

public class Person {
  private String name;
  private String surname;
  private int age;

  public Person(String name, String surname, int age) {
    this.name = name;
    this.surname = surname;
    this.age = age;
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

  public void goHome() {
    System.out.println("Person is going home...");
  }

  @Override
  public String toString() {
    return String.format("Person[name='%s', surname='%s', age=%d]", name, surname, age);
  }
}
