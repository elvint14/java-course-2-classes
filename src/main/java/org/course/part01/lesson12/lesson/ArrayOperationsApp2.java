package org.course.part01.lesson12.lesson;

public class ArrayOperationsApp2 {
  public static void main(String[] args) {
    int[] nums = {11, 0, 2, -54, 78, 8, -9, 15, 23};
    int[] copiedArray = copy(nums);
    printArray(nums);
    printArray(copiedArray);
    System.out.println(findV1(2, nums));
    System.out.println(findV2(2, nums));
    System.out.println(findV1(-5, nums));
    System.out.println(findV2(-5, nums));
  }

  private static boolean findV1(int num, int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == num) return true;
    }
    return false;
  }

  private static boolean findV2(int num, int[] nums) {
    for (int el : nums) {
      if (el == num) return true;
    }
    return false;
  }

  private static void printArray(int[] arr) {
    System.out.print('[');
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);
      if (i != arr.length - 1) System.out.print(", ");
    }
    System.out.print(']');
    System.out.print('\n');
  }

  private static int[] copy(int[] original) {
    int[] copy = new int[original.length];
    for (int i = 0; i < copy.length; i++) {
      copy[i] = original[i];
    }
    return copy;
  }
}