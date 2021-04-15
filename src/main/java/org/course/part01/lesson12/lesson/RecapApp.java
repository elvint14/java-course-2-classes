package org.course.part01.lesson12.lesson;

public class RecapApp {
  public static void main(String[] args) {

    int a;
    a = 10;

    int b = 20;

    int[] myArray0;

    int[] myArray1 = {1, 2, 3, 4, 5, 6};
    //                0  1  2  3  4  5

    int[] myArray2 = new int[5];
    myArray2[1] = 10;
    myArray2[0] = -5;

    int[] myArray3 = new int[]{1, 2, 3, 4, 5}; // [0,4]

//    System.out.println(myArray3[10]);

    for (int i = 0; i < myArray3.length; i++) {
      System.out.println(myArray3[i]);
    }

  }
}