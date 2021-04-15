package org.course.part01.lesson15.lesson;

public class MemoryApp {
  public static void main(String[] args) {
    int a = 5;
    char c = '#';

    String name = "Elvin";

    int b = 10;
    int d = 20;
    System.out.println("b is: " + b + " and d is: " + d);
    swap(b, d);
    System.out.println("b is: " + b + " and d is: " + d);

    int[] bArr = {10};
    int[] dArr = {20};
    System.out.println("b is: " + bArr[0] + " and d is: " + dArr[0]);
    swapArr(bArr, dArr);
    System.out.println("b is: " + bArr[0] + " and d is: " + dArr[0]);
  }

  public static void swap(int b, int d) {
    int temp = b;
    b = d;
    d = temp;
  }

  public static void swapArr(int[] b, int[] d) {
    int temp = b[0];
    b[0] = d[0];
    d[0] = temp;
  }

}