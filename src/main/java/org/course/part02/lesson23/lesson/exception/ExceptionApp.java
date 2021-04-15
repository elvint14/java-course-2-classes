package org.course.part02.lesson23.lesson.exception;

public class ExceptionApp {
  public static void main(String[] args) {

    // compile-time error -> sintaktik səhv
    // runtime-time exception -> əməliyyat zamanı yaranmış səhvlər (məntiqi)


    // ArithmeticException
    System.out.println("Elvin");
//    System.out.println(10/0);

    // ArrayIndexOutOfBoundsException
    int[] arr = new int[]{1, 2, 3, 4, 5}; //index -> -1 [0,4] 5
//    System.out.println(arr[-1]);
//    System.out.println(arr[5]);


    // StringIndexOutOfBoundsException
    // NullPointerException
    String name = "Salam adim Rovsendir.";
    System.out.println(name.length());
    // last index = length - 1
    // String name = null;
    System.out.println(name.charAt(20));
    System.out.println();


  }
}