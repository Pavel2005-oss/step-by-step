package work_13_03_2025;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// вызов сканера
        System.out.print("Введите число N: "); //данные с консоли
        int N = scanner.nextInt(); // запить данных с консоли в N
        for (int i = 2; i <= N; i++) { //с двух до N с шагом 1
            boolean isPrime = true; /// положительное условие
            for (int j = 2; j < i; j++) {
                if (i % j == 0) { // остаток от деления присваевается ноль
                    isPrime = false; /// если условия ифа верны значил фол
                    break; /// в свичах это необходима тут нет смысла
                }
            }
            if (isPrime) { /// к чему это написанно нет условия
                System.out.print(i + " "); // вывод фора плюс операция с нимм
            }
        }
        scanner.close();// закрытие сканера
    }
}
