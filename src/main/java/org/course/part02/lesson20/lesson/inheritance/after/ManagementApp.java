package org.course.part02.lesson20.lesson.inheritance.after;

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

    System.out.println(elvin.getName());
    eli.giveFinalExam();
    eli.goToCinema();

    rovshen.goToCinema();

    Student           student         = new Student("abc", "ABC", 22, 67);
    //data_type   variable_name        value
    int            a                  = 4;
  }
}
