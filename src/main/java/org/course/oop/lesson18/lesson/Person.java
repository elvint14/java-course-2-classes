package org.course.oop.lesson18.lesson;

public class Person {
  // attributes -> "fields"
  String name;
  String surname;
  int age;

  // construct-inşa etmək-yaratmaq
  // "constructors"
  public Person(String ad, String soyad, int yash) {
    name = ad;
    surname = soyad;
    age = yash;
  }

  public Person(String soyad, int yash) {
    surname = soyad;
    age = yash;
  }

  public Person() {

  }

}