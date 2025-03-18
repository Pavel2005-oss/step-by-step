package work_11_03_2025.Operators;

/*
Считать целое число с консоли.

Используя if-else, вывести, чётное ли оно или нечётное.
 */

import java.util.Scanner;

public class OperatorsOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число-> ");
        int number = scanner.nextInt();
        if (number % 2 == 0){
            System.out.println(number + " число четное");
        }else{
            System.out.println(number + " число не четное");
        }
        scanner.close();

    }
}
