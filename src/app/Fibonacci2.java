package app;

import java.util.Scanner;

class Fibonacci2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();

        System.out.println(Fibonacci(n));

        scanner.close();
    }

    public static Integer Fibonacci(Integer n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
}