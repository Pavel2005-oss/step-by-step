package March.март.work_11_03_25.Operators;

/*
Считать три целых числа.

С помощью вложенных if или if-else-if
определить наибольшее из них.

Вывести результат.
 */

import java.util.Scanner;

public class OperatorsThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int numberOne = scanner.nextInt();
        System.out.println("Введите второе число");
        int numberTwo = scanner.nextInt();
        System.out.println("Введите третие число");
        int numberThree = scanner.nextInt();

        int max = numberOne;

        if(numberTwo > max){
            max = numberTwo;
        }

        if(numberThree > max){
            max = numberThree;
        }

        System.out.println(max);

//        if (numberOne > numberTwo){
//            System.out.println("Первое число наибольшее"); // первое больше второго
//        } else if (numberOne < numberTwo) {
//            System.out.println("Второе число наибольшее");// второе больше первого
//        } else if (numberTwo > numberThree) {
//            System.out.println("Второе число наибольшее");// второе больше третиго
//        } else if (numberThree > numberTwo) {
//            System.out.println("Третие число наибольшее");// второе больше третиго
//        } else if (numberThree > numberOne){
//            System.out.println("Третие число наибольшее");// третие больше первого
//        } else if (numberThree < numberOne){
//            System.out.println("Первое число наибольшее");// третие больше первого
//        }
        scanner.close();
    }
}
