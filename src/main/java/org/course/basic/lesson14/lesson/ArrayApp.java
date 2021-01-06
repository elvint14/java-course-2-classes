package org.course.basic.lesson14.lesson;

public class ArrayApp {
  public static void main(String[] args) {
    char[] letters = {'a', 'b', 'c', 'd', 'e', 'f'};
    char[] symbols = {'!', '@', '#', '$', '%', '^'};

    for (char letter : letters) {
      System.out.print(letter + " --- ");
    }
    System.out.println();
    for (char symbol : symbols) {
      System.out.print(symbol + " ");
    }

  }
}

//    int[] nums = {1, 2, 3, 4, 5, 6, 7};
//
//    for (int num : nums) {
//      System.out.print(num + "-");
//    }
//    System.out.println('?');
//    System.out.println((int) '?');