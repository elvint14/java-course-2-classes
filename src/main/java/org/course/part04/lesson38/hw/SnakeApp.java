package org.course.part04.lesson38.hw;

import java.util.Scanner;

public class SnakeApp {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        int count = 1;
        for (int row = 1; row <= n; row++) {
            if (row % 2 == 1) {
                count = row == 1 ? count : count + n + 1;
                for (int col = 1; col <= n; col++) {
                    System.out.print(count++ + "\t");
                }
            } else {
                count += n - 1;
                for (int col = 1; col <= n; col++) {
                    System.out.print(count-- + "\t");
                }
            }
            System.out.println();
        }

    }
}
