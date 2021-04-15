package org.course.part01.lesson13.lesson;

public class TwoDForEachApp {
  public static void main1(String[] args) {

    int[] nums = {1, 2, 5, 21, -9, 52};

    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i] + " ");
    }

    System.out.println();

    for (int num : nums) {
      System.out.print(num + " ");
    }

  }

  public static void main(String[] args) {
    int[][] arr = fill2D(4, 1, '#');
    print(arr);
  }

  public static int[][] fill2D(int x, int y, char c) {
    int[][] arr = new int[x][y];
    for (int setir = 0; setir < arr.length; setir++) {
      for (int sutun = 0; sutun < arr[setir].length; sutun++) {
        arr[setir][sutun] = c;
      }
    }
    return arr;
  }

  public static void print(int[][] origin) {
    for (int[] row : origin) {
      for (int col : row) {
        System.out.print((char) col + "\t");
      }
      System.out.println();
    }
  }
}