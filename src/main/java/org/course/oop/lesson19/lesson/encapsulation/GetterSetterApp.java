package org.course.oop.lesson19.lesson.encapsulation;

import java.util.Scanner;

public class GetterSetterApp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Person eli = new Person("Eli", "Muxtarli");
    System.out.println(eli);

//    System.out.println(eli.getName());
//    System.out.println(eli.getSurname());
//    System.out.println(eli.getAge());
//    System.out.println(eli.getGender());

    eli.setAge(sc.nextInt());
    System.out.println(eli);
    System.out.println(eli.getAge());

    eli.setAge(20);
    System.out.println(eli);
    System.out.println(eli.getAge());
    eli.setGender("male");
    System.out.println(eli);

  }
}
