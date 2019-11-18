package app;

import java.util.Scanner;

class NaturalMultiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer i = scanner.nextInt();
        Integer j = scanner.nextInt();

        System.out.println(Multiply(i, j));
    }

    public static Integer Multiply(Integer i, Integer j) {
        return Multiply(i, j, 0);
    }

    public static Integer Multiply(Integer i, Integer j, Integer sum) {
        if (j == 0) {
            return sum;
        }

        return Multiply(sum + i, i, j - 1);
    }
}