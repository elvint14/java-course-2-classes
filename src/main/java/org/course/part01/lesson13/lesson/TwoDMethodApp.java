package org.course.part01.lesson13.lesson;

public class TwoDMethodApp {
  public static void main(String[] args) {
    int[][] arr = fill2D(2, 3, '#');
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
    for (int setir = 0; setir < origin.length; setir++) {
      for (int sutun = 0; sutun < origin[setir].length; sutun++) {
        System.out.print((char) (origin[setir][sutun]) + "\t");
      }
      System.out.println();
    }
  }
}