package org.course.part01.lesson17.lesson;

public class CompareApp {
  public static void main(String[] args) {

    String s1 = "Elvin";
    String s2 = "Elvin";
    String s3 = new String("Elvin");
    String s4 = "ElviN";
    String s5 = "ElviN";

    System.out.println(s1 == s2);      // #123 == #123 -> true
    System.out.println(s1 == s3);      // #123 == #ab4 -> false
    System.out.println(s1 == s4);      // #123 == #nj5 -> false

    System.out.println(s1.equals(s2)); // "Elvin" == "Elvin" -> true
    System.out.println(s1.equals(s3)); // "Elvin" == "Elvin" -> true
    System.out.println(s1.equals(s4)); // "Elvin" == "ElviN" -> false
    System.out.println(s1.equalsIgnoreCase(s4)); // "Elvin" == "ElviN" -> true

    int a = 5;
    int b = 5;
    System.out.println(a == b);

    String s6 = "Eli";

    // Garbage Collector -> GC

  }
}
