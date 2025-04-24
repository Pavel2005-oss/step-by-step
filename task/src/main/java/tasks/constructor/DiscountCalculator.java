package tasks.constructor;

/*
Задача: Калькулятор скидки
Создайте новый класс DiscountCalculator (англ. «калькулятор скидки»).
У него не будет полей.
Добавьте конструктор по умолчанию (без параметров).
Добавьте метод calculateDiscount(double totalPrice, int age), который:
Если age (возраст) ≥ 65, возвращает скидку 15% от totalPrice.
Если 18 ≤ age < 65, скидка 5%.
Если age < 18, скидка 10%.
В классе Main:

Создайте объект DiscountCalculator через конструктор.
Вызовите метод calculateDiscount для разных значений totalPrice и age.
Выведите результат в консоль.
 */

import java.util.Scanner;

public class DiscountCalculator {
    public static void calculateDiscount(int age) {
        if (age >= 65) {
            System.out.println("скидка 15%");
        } else if (age >= 18 && age < 65) {
            System.out.println("скидка 5%");
        } else if (age < 18) {
            System.out.println("скидка 10%");
        }
    }

    public static void main(String[] args) {
        calculateDiscount( 20);  // Пример вызова с корректными параметрами
    }
}