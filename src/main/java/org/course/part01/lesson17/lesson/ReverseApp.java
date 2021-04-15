package org.course.part01.lesson17.lesson;

public class ReverseApp {
  public static void main(String[] args) {
    // abcde -> edcba
    printReverse("abcde");
    printReverse("elvin");

    String reverse1 = reverse1("abcde");
    String reverse2 = reverse1("elvin");

    System.out.println(reverse1);
    System.out.println(reverse2);

    String reverseSB1 = reverseSB("abcde");
    String reverseSB2 = reverseSB("elvin");
    System.out.println(reverseSB1);
    System.out.println(reverseSB2);
  }

  static void printReverse(String line) {
    for (int index = line.length() - 1; index >= 0; index--) {
      System.out.print(line.charAt(index));
    }
    System.out.println();
  }

  static String reverse1(String line) {
    int len = line.length();
    char[] reverseChars = new char[len];
    for (int idx = len - 1; idx >= 0; idx--) {
      reverseChars[len - idx - 1] = line.charAt(idx);
    }
    return new String(reverseChars);
  }

  private static String reverseSB(String line) {
    return new StringBuilder(line).reverse().toString();
  }
}
