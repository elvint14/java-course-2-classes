package org.course.part01.lesson16.lesson;

public class MemoryApp {
  public static void main(String[] args) {
    // primitive data types
    int b = 10;
    int d = 20;
    System.out.println("=====1=====");
    System.out.println("b is: " + b + " and d is: " + d);
    swap(b, d); // passing-by-value (clone value)
    System.out.println("b is: " + b + " and d is: " + d);

    // reference data type
    int[] bArr = {10};
    int[] dArr = {20};
    System.out.println("=====2=====");
    System.out.println("b is: " + bArr[0] + " and d is: " + dArr[0]);
    swapArr(bArr, dArr); // passing-by-reference (address)
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