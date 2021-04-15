package org.course.part01.lesson06.lesson.operation;

public class ArithmeticOperatorsApp {
  public static void main1(String[] args) {

    int a = 10;
    int b = 15;

    System.out.println("Sum is:" + (a + b)); // String + (int + int)
    System.out.println("Sum is:" + a + b);   // String + int + int

//    + -> birleshdirme operatoru o zaman ki, tereflerden biri String tipdedir.

//    2+2:2   = 3
//    (2+2):2 = 2
//    yuxaridan -> ashagi
//    sola -> saga


  }

  public static void main(String[] args) {

    int a = 100;
    int b = 15;

    System.out.println(a);    // 100
    System.out.println(b);    // 15

    System.out.println(++a);  // 100 => a = a + 1 -> 101
    System.out.println(--b);  // 14  => b = b - 1 -> 14

    System.out.println(a++);  // 101 => a = a + 1 = 102
    System.out.println(b--);  // 14  => b = b - 1 = 13

    System.out.println(a);    // 102
    System.out.println(b);    // 13



//    System.out.println("Addition is: " + (a + b));
//    System.out.println("Subtraction is: " + (a - b));
//    System.out.println("Multiplication is: " + (a * b));
//    System.out.println("Division is: " + (a / b));
//    System.out.println("Modulus is: " + (a % b));

//    System.out.println("Before:");
//    System.out.println(a);
//    System.out.println(b);
//
//    a = a + 1; // a = 100 + 1 = 101
//    b = b - 1; // b = 15 - 1 = 14
//
//    System.out.println("After:");
//    System.out.println(a);
//    System.out.println(b);
//    System.out.println("Before:");
//    System.out.println(a);
//    System.out.println(b);
//
//    a++; // => (a = a + 1) ->  a = 100 + 1 = 101
//    b--; // => (b = b - 1) ->  b = 15 - 1 = 14
//
//    System.out.println("After:");
//    System.out.println(a);
//    System.out.println(b);
//    System.out.println(a++); // 100 -> print:100 -> a = a + 1 -> a = 101
//    System.out.println(b--); // 15  -> print:15  -> b = b - 1 -> b = 14
//    a = 101; b = 14;
//    System.out.println(a);   // 101
//    System.out.println(b);   // 14
//    System.out.println(a);      // 100
//    System.out.println(b);      // 15
//
//    a++; // a = a + 1;
//    a+1; //     a + 1
//    System.out.println(a + 1);  // 101
//    System.out.println(b - 1);  // 14
//
//    System.out.println(a);      // 100
//    System.out.println(b);      // 15

  }
}