package March.work_13_03_25;

import java.util.Scanner;

public class T2 {

    public static void main(String[] args) {
        int N = readInput(); // Чтение числа N
        printPrimes(N); // Вывод простых чисел
    }

    public static int readInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int N = scanner.nextInt();
        scanner.close();
        return N;
    }

    public static void printPrimes(int N) {
        System.out.println("Простые числа от 2 до " + N + ":");
        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Перенос строки после вывода
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false; // Числа меньше 2 не являются простыми
        for (int j = 2; j <= Math.sqrt(num); j++) {
            if (num % j == 0) {
                return false; // Если делится на j, то это не простое
            }
        }
        return true; // Если прошло все проверки, значит простое
    }
}

