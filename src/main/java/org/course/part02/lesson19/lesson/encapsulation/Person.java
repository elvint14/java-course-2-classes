package org.course.part02.lesson19.lesson.encapsulation;

public class Person {
  private String name;
  private String surname;
  private int age;
  private String gender;

  public Person(String name, String surname, int age, String gender) {
    this.name = name;
    this.surname = surname;
    this.age = age;
    this.gender = gender;
  }

  public Person(String name, String surname) {
    this.name = name;
    this.surname = surname;
  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return this.name;
  }

  public String getSurname() {
    return surname;
  }

  public int getAge() {
    return age;
  }

  public String getGender() {
    return gender;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  @Override
  public String toString() {
    return String.format("Person[name='%s', surname='%s', age=%d, gender='%s']",
            name, surname, age, gender);
  }
}