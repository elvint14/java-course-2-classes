package org.course.part01.lesson06.lesson.operation;

public class LogicalOperatorsApp {
  public static void main(String[] args) {

    int a = 10;
    int b = 3;

//  a-nin b-ye %-u 0-a beraber olsun "AND" a 8 olsun!
//    boolean result = (a % b == 0) && (a == 8); // => 0 == 0 => true
//                        true         true -> true

//  a-nin b-ye %-u 0-a beraber olsun "OR" a 8 olsun!
//    boolean result = (a % b == 0) || (a == 8); // => 0 == 0 => true
//                        false        true -> true

//    "NOT"
    boolean result = !(a % 2 == 1);

    System.out.println(result);

  }
}