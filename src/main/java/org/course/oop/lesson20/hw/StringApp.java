package org.course.oop.lesson20.hw;

public class StringApp {
  public static void main(String[] args) {

    String email = "elvin@taghiyev@gmail.com";

    String[] split = email.split("@");
    System.out.println(email.split("@")[0]);
    System.out.println(split[0]);
    System.out.println(split[1]);
    System.out.println(split[2]);
    System.out.println(split[3]); // exception

  }
}
