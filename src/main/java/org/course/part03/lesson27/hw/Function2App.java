package org.course.part03.lesson27.hw;

import java.util.Scanner;

public class Function2App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            double num = sc.nextDouble();
            double result = Math.sqrt(num) + 2 * num + Math.sin(num);
            System.out.printf("%.4f\n", result);
        }
    }
}