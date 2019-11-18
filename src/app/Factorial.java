package app;

import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();

        Integer last = 1;

        for (int i = 1; i <= n; i++) {
            last *= i;
        }

        System.out.println(last);
    }
}