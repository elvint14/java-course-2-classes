package org.course.part02.lesson20.lesson.inheritance.after;

public class Human {
  private String name;
  private String surname;
  private int age;

  public Human(String name, String surname, int age) {
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

  public void goToCinema() {
    System.out.println("Go to cinema!");
  }

  @Override
  public String toString() {
    return String.format("Human[name='%s', surname='%s', age=%d]", name, surname, age);
  }

}