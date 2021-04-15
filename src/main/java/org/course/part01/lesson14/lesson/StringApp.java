package org.course.part01.lesson14.lesson;

public class StringApp {
  public static void main(String[] args) {

    String name = "ElviN";
    String surname = "Taghizade";
    String gender = "Male";
    String age = "21";

    System.out.println(name.toLowerCase());
    System.out.println(surname.toUpperCase());
    System.out.println(gender.contains("f"));
    System.out.println(name.contains("lvi"));
    System.out.println(name.replace("El", "ABC123"));
    System.out.println(surname.substring(2, 5));
    System.out.println(surname.substring(3));
    String sent = "   ABXabsajksd   ";
    System.out.println(sent.trim());
  }
}