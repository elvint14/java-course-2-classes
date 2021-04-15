package org.course.part01.lesson13.lesson;

public class TwoDimenArrApp {
  public static void main(String[] args) {

    int[] arr1 = new int[5];
    int[][] arr2 = new int[5][8];
    int[][][] arr3 = new int[6][7][6];

    int[] alma = new int[]{10, 21, 3, -8, 57};
    int[][] armud = new int[][]{
            {1, 79, -2},
            {8, -5, 32},
            {15, 4, 45}
    };

    System.out.println(armud[1][2]);
    System.out.println(armud[3][3]);

    int[] armudSetir1 = armud[1];

  }
}
