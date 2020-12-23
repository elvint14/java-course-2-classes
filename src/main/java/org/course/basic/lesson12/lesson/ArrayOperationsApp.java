package org.course.basic.lesson12.lesson;

public class ArrayOperationsApp {
  public static void main(String[] args) {
    int[] nums = {11, 0, 2, -54, 78, 8, -9, 15, 23};

    int sum = 0;
    int sumPos = 0;
    int sumNeg = 0;
    int sumOdd = 0;
    int sumEven = 0;
    for (int i = 0; i < nums.length; i++) {
      int el = nums[i];
      sum += el;
      if (el >= 0) sumPos += el;
      else sumNeg += el;
      if (el % 2 == 0) sumEven += el;
      else sumOdd += el;
    }

    System.out.println("Sum is: " + sum);
    System.out.println("Average is: " + (sum / nums.length));
    System.out.println("Sum of positives is: " + sumPos);
    System.out.println("Sum of negatives is: " + sumNeg);
    System.out.println("Sum of evens is: " + sumEven);
    System.out.println("Sum of odds is: " + sumOdd);

  }
}