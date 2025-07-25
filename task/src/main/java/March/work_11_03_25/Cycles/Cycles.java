package March.work_11_03_25.Cycles;

import java.util.Random;
import java.util.Scanner;
public class Cycles {
    public static void main(String[] args) {
        cycles();
        table();
        Factorial();
        ReverseNumber();

    }

    /**
     * Сумма чисел от 1 до n
     * Считать n.
     * С помощью цикла for вычислить сумму всех целых чисел от 1 до n.
     * Вывести результат.
     */
    public static void cycles () {
        Random random = new Random();
        int number = random.nextInt();
        int n = 0;
        if (number > 0 ){
            for (int i = 1; i <= number; i++){
                n += i;
            }
        }else
            System.out.println("Число отрицательное");

        System.out.println("результат -> " + n);

    }
    /**
     * С помощью вложенных циклов for выведите таблицу умножения от 1 до 10.
     *Оформите вывод в виде таблицы.
     */
    public static void table() {
        System.out.println("Таблица умножения от 1 до 10:");

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d ", i * j);
            }
            System.out.println();

        }
    }
    /**
     * Считать целое число n.
     * Используя цикл while или for, найдите n! (факториал).
     *Выведите результат.
     */

    public static void Factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число n: ");
        int n = scanner.nextInt();
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i; // Умножаем текущее значение на i
        }

        System.out.println("Факториал " + n + " равен " + factorial);
    }

    /**
     * Считать целое число n.
     * С помощью цикла while «развернуть» это число (например, 123 → 321).
     *Вывести результат.
     */


    public static void ReverseNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число n: ");
        int n = scanner.nextInt();
        int reversedNumber = 0;
        while (n != 0) {
            int digit = n % 10;
            reversedNumber = reversedNumber * 10 + digit;
            n /= 10;
        }
        System.out.println("Перевернутое число: " + reversedNumber);
    }

    /**
     * Считать целое число n.
     * С помощью цикла for и проверок (условных операторов) вывести все простые числа от 2 до n.
     * Можно реализовать отдельный метод isPrime(int x).
     */




}
