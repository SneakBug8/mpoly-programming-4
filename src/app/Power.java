package app;

import java.util.Scanner;

class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer i = scanner.nextInt();
        Integer j = scanner.nextInt();

        System.out.println(Power(i, j));
    }

    public static Integer Power(Integer i, Integer j) {
        return Power(i, j, 1);
    }

    public static Integer Power(Integer i, Integer j, Integer sum) {
        if (i < 0 || j < 0) {
            throw new Error("Error");
        }

        if (j == 0) {
            return sum;
        }

        return Power(i, j - 1, sum * i);
    }
}