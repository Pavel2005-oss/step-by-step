package work_11_03_2025.Operators;
import java.util.Scanner;
/*
Считать год (целое число).
Используя условные операторы, проверить, является ли он високосным
(делится на 4, но не на 100, либо делится на 400).


Вывести результат.
 */
public class OperatorsFour {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите год: ");
            int year = scanner.nextInt();

            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

            if (isLeapYear) {
                System.out.println(year + " является високосным годом.");
            } else {
                System.out.println(year + " не является високосным годом.");
            }
        }
}
