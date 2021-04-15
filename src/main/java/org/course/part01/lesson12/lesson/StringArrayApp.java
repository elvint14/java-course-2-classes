package org.course.part01.lesson12.lesson;

public class StringArrayApp {
  public static void main(String[] args) {
    String[] names = {"Jonas", "Tina", "Tom", "Steve", "Amanda", "Hanna", "Rebecca", "Carl"};

    for (String name : names) {
      System.out.println(name);
    }

    System.out.println("-------");

    for (int i = 0; i < names.length; i++) {
      System.out.println(names[i]);
    }
  }
}
