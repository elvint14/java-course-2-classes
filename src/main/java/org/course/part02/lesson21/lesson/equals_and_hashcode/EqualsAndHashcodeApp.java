package org.course.part02.lesson21.lesson.equals_and_hashcode;

public class EqualsAndHashcodeApp {
  public static void main1(String[] args) {

    String name1 = "Elvin";
    String name2 = new String("Elvin");

    System.out.println(name1 == name2);
    System.out.println(name1.equals(name2));

  }

  public static void main(String[] args) {

    Person elvin = new Person("Elvin", 20);
    Person eli = new Person("Elvin", 21);

    System.out.println(elvin == eli);           // false

    System.out.println(elvin.equals(eli));      // false

    System.out.println(eli.hashCode());
    System.out.println(elvin.hashCode());

  }
}