package org.course.basic.lesson15.lesson;

public class StringRecapApp {
  public static void main(String[] args) {

//    String fullName = "Elvin -!@# Taghizade -!@# Elvin -!@# Taghizade -!@# Elvin -!@# Taghizade";

    String email = "elvintaghiyev184@gmail.com";

    String[] strings = email.split("@");

    for (String string : strings) {
      System.out.println(string);
    }

    String fullName = "Elvin";
    System.out.println(fullName.concat("Taghizade"));
  }
}