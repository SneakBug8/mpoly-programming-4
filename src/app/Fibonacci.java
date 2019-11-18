package app;

import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();

        Integer first = 1;
        Integer last = 1;

        if (n > 2) {
            for (int i = 2; i < n; i++) {
                Integer newnumber = first + last;
                first = last;
                last = newnumber;
            }
        }

        System.out.println(last);
    }
}