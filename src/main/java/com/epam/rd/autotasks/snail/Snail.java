package com.epam.rd.autotasks.snail;

import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();

        int days = calculateDays(a, b, h);

        if (days == -1) {
            System.out.print("Impossible");
        } else {
            System.out.print(days);
        }
    }

    private static int calculateDays(int a, int b, int h) {
        if (a >= h) {
            return 1;
        } else if (a <= b) {
            return -1;
        }

        int distance = a - b;
        int days = (h - b + distance - 1) /distance;
        return days;
    }
}
