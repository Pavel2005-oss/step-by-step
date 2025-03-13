package work_04_03_25;

/*
калькулятор с двумя переменными
ввод с консоли
базовые операции (выбор в консоли)
введите 1 число
введите 2 число
выберите операцию
		   - + — сложение
		   - - — вычитание
		   - * — умножение
		   - / — деление
		   - % — остаток от деления
 */

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // сканер

        System.out.println("Введите первое число 1: "); //вводим число 1
        long number = scanner.nextInt();
        System.out.println(number);

        System.out.println("Введите первое число 2: "); //вводим число 2
        long numbers = scanner.nextInt();
        System.out.println(numbers);

        System.out.println("Выберите операцию (+)(-)(*)(/)(%): "); //выбираем знак
        char operation = scanner.next().charAt(0);
        System.out.println(operation);



        switch (operation){
            case '+':
                long addition = number + numbers;
                System.out.println("Результат сложения: " + addition); // вывод сложения
                break;

            case '-':
               long subtraction = number - numbers;
                System.out.println("Результат вычитания: " + subtraction); // вывод вычитания
                break;
            case '*':
                long multiplication = number * numbers;
                System.out.println("Результат умножения: " + multiplication); // вывод умножения
                break;
            case '/':
                long division = number / numbers;
                System.out.println("Результат деления: " + division); // вывод деления
            case '%':
                double remainder = number % numbers;
                System.out.println("Результат остатка от деления: " + remainder); // вывод модуля
        }
    }
}
