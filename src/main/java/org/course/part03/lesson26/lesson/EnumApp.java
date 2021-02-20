package org.course.part03.lesson26.lesson;

import java.util.Scanner;

import static org.course.part03.lesson26.lesson.WeekDay.*;


public class EnumApp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();

    String weekDay = showWeekDay(num);

    System.out.println(weekDay);
  }

  private static String showWeekDay(int num) {
    switch (num) {
      case 1: return MONDAY.getName();
      case 2: return TUESDAY.name();
      case 3: return WEDNESDAY.name();
      case 4: return THURSDAY.name();
      case 5: return FRIDAY.name();
      case 6: return SATURDAY.name();
      case 7: return SUNDAY.name();
      default: return UNKNOWN.name();
    }
  }
}