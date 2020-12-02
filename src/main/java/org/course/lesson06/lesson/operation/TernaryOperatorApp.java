package org.course.lesson06.lesson.operation;

public class TernaryOperatorApp {
  public static void main(String[] args) {

    int a = 11;
    int b = 2;

    /*
     Eger a > b ==> ekrana: AAAAA
     EKS HALDA: ==> ekrana: BBBBB
     */

//    TERNARY OPERATOR ==> condition ? TRUE : FALSE;

    System.out.println((a > b) ? "AAAAA" : "BBBBB");

    double grade = 80;
    double scholarship = grade > 90 ? 200 : 100;
    System.out.println(scholarship);
  }
}