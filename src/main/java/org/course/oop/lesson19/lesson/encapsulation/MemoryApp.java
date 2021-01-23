package org.course.oop.lesson19.lesson.encapsulation;

public class MemoryApp {
  public static void main(String[] args) {

//    int[] ints = new int[5];
//    System.out.println(ints);

    Person person = new Person("Elvin", "Taghizade", 21, "male");
    System.out.println(person);

    Person rovshen = new Person("Rovshen", 19);
    System.out.println(rovshen);

    Person eli = new Person("Eli", "Muxtarli");
    System.out.println(eli);
  }
}
