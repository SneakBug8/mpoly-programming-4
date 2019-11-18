package app;

import java.util.Scanner;

class Factorial2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();

        System.out.println(Factorial(n));

        scanner.close();
    }

    public static Integer Factorial(Integer n) {
        if (n == 0) {
            return 1;
        }

        return n * Factorial(n - 1);
    }
}