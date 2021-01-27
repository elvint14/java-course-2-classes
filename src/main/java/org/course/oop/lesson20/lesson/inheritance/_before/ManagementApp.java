package org.course.oop.lesson20.lesson.inheritance._before;

public class ManagementApp {
  public static void main(String[] args) {

    Human human = new Human("Human", "Human", 0);
    Student eli = new Student("Eli", "Muxtarli", 19, 85);
    Student rovshen = new Student("Rovshen", "Meherremov", 20, 85);
    Teacher elvin = new Teacher("Elvin", "Taghizade", 21, 0);


    System.out.println(human);
    System.out.println(eli);
    System.out.println(rovshen);
    System.out.println(elvin);

  }
}
