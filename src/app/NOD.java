package app;

import java.util.Scanner;

class NOD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer i = scanner.nextInt();
        Integer j = scanner.nextInt();

        System.out.println(NOD(i, j));
    }

    public static Integer NOD(Integer i, Integer j) {
        return NOD(i, j, 0);
    }

    public static Integer NOD(Integer i, Integer j, Integer sum) {
        if (j == 0) {
            return sum;
        }

        return NOD(i, j - 1, sum * i);
    }
}