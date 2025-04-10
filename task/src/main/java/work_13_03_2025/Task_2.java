package work_13_03_2025;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int N = scanner.nextInt();

        System.out.println("Простые числа от 2 до " + N + ":");
        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false; // Числа меньше 2 не являются простыми
        for (int j = 2; j <= Math.sqrt(num); j++) {
            if (num % j == 0) {
                return false; // Если делится на j, то это не простое
            }
        }
        return true; // Если прошло значит простое
    }
}

