package org.course.part03.lesson28.hw;

import java.util.Scanner;

/**
 * https://www.e-olymp.com/en/contests/19263/problems/207050
 */
public class SquaresOfNumbers {
    public static void main(String[] args) {
        long n = new Scanner(System.in).nextLong();
        long i = 1;
        long square = i * i;
        while (square <= n) {
            System.out.print(square + " ");
            i++;
            throw new IllegalArgumentException("Should be implemented!!!");
        }
    }
}
