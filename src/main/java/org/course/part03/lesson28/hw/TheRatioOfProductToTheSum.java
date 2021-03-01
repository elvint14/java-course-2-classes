package org.course.part03.lesson28.hw;

import java.util.Scanner;

/**
 * https://www.e-olymp.com/en/contests/19263/problems/207025
 */
public class TheRatioOfProductToTheSum {
    public static void main(String[] args) {
        long num = new Scanner(System.in).nextLong();

        double sum = 0;
        double prod = 1;
        long tmp = num;

        while (tmp > 0) {
            long lastDigit = tmp % 10;
            sum += lastDigit;
            prod *= lastDigit;
            tmp /= 10;
        }

        System.out.printf("%.3f", (prod / sum));
    }
}
