package org.course.oop.lesson22.lesson.casting;

public class CastingApp {
  public static void main(String[] args) {

    // CASTING
    int a = 6;
    long b = (long) a; // upcasting

    long c = 100;
    int d = (int) c;   // downcasting


    // BOXING
    int p = 10;
    Integer r1 = new Integer(10);    // boxing
    Integer r2 = 10;                  // auto-boxing

    Integer myBox = 101;
    int unBox1 = myBox.intValue();    // unboxing
    int unBox2 = myBox;               // auto-unboxing


  }
}
