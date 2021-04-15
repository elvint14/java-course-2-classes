package org.course.part01.lesson14.lesson;

public class SentenceApp {
  public static void main(String[] args) {

    String name = "KARABAKH";
    String surname = "Taghizade";

    char[] nameCharacters = new char[]{'e', 'l', 'v', 'i', 'n'};
    char[] chars = name.toCharArray();
    for (char aChar : chars) {
      System.out.print(aChar + " - ");
    }
    System.out.println();
    for (char c : nameCharacters) {
      System.out.print(c);
    }

    int[] nums = {1, 2, 3};
    System.out.println(nums);
//
    System.out.println(name);
    System.out.println(surname);

  }
}