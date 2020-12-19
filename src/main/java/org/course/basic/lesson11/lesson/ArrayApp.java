package org.course.basic.lesson11.lesson;

public class ArrayApp {
  public static void main(String[] args) {
//  declaration:
    int a;
//  initialization:
    a = 5;
//  declaration-initialization
    int b = 10;

//  ---------------

//  declaration:
    int[] array1;
//  initialization:
    array1 = new int[]{11, 8, 97, 45, 32, 10};

//  declaration-initialization
    int[] array2 = new int[]{12, -32, 43, 5};
    // index: [0-3]
//    array2[4] = 100;

//  ---------------
    int[] grades = new int[5];
    grades[0] = 76;
    grades[3] = 54;
    grades[2] = 78;
    grades[1] = 89;
    grades[4] = 92;
//  last_index = length - 1;

    System.out.println("Array1 length: " + array1.length);
    System.out.println("Array2 length: " + array2.length);
    System.out.println("Grades length: " + grades.length);
    for (int i = 0; i < array2.length; i++) {
      System.out.print(array2[i] + " ");
    }

    System.out.println();

    for (int i = array1.length - 1; i >= 0; i--) {
      System.out.print(array1[i] + " ");
    }

    System.out.println();

    for (int i = 0; i < grades.length; i++) {
      System.out.println((i + 1) + ". Grade is: " + grades[i]);
    }

  }
}