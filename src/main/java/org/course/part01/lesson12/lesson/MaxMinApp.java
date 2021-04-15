package org.course.part01.lesson12.lesson;

public class MaxMinApp {
  public static void main(String[] args) {
    // 1. input
    int[] nums = {11, 0, 2, -54, 78, 8, -9, 15, 23};

    // 2. process
    int max = nums[0];
    int min = nums[0];

    for (int i = 1; i < nums.length; i++) {
      if (max < nums[i]) max = nums[i];
      if (min > nums[i]) min = nums[i];
    }

    // 3. output
    System.out.println("Max is: " + max);
    System.out.println("Min is: " + min);
  }
}