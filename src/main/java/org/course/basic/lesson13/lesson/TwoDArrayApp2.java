package org.course.basic.lesson13.lesson;

public class TwoDArrayApp2 {
  public static void main1(String[] args) {
    int[][] arr = new int[5][5];

    for (int setir = 0; setir < arr.length; setir++) {
      for (int sutun = 0; sutun < arr[setir].length; sutun++) {
        arr[setir][sutun] = 1;
      }
    }

    for (int setir = 0; setir < arr.length; setir++) {
      for (int sutun = 0; sutun < arr[setir].length; sutun++) {
        System.out.print(arr[setir][sutun] + " ");
      }
      System.out.println();
    }
  }

  public static void main2(String[] args) {
    int[][] arr = new int[5][5];
    int count = 1;

    for (int setir = 0; setir < arr.length; setir++) {
      for (int sutun = 0; sutun < arr[setir].length; sutun++) {
        arr[setir][sutun] = count;
        count++;
      }
    }

    for (int setir = 0; setir < arr.length; setir++) {
      for (int sutun = 0; sutun < arr[setir].length; sutun++) {
        System.out.print(arr[setir][sutun] + "\t ");
      }
      System.out.println();
    }
  }

  public static void main3(String[] args) {
    char[][] arr = new char[5][5];

    for (int setir = 0; setir < arr.length; setir++) {
      for (int sutun = 0; sutun < arr[setir].length; sutun++) {
        if (setir % 2 == 0) arr[setir][sutun] = '#';
        else arr[setir][sutun] = '$';
      }
    }

    for (int setir = 0; setir < arr.length; setir++) {
      for (int sutun = 0; sutun < arr[setir].length; sutun++) {
        System.out.print(arr[setir][sutun] + "\t");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    char[][] arr = new char[5][5];

    for (int setir = 0; setir < arr.length; setir++) {
      for (int sutun = 0; sutun < arr[setir].length; sutun++) {
        arr[setir][sutun] = 'x';
      }
    }

    for (int setir = 0; setir < arr.length; setir++) {
      for (int sutun = 0; sutun < arr[setir].length; sutun++) {
        System.out.print(arr[setir][sutun] + "\t");
      }
      System.out.println();
    }
  }
}