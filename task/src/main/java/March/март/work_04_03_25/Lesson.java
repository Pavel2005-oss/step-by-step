package March.март.work_04_03_25;

import java.util.Scanner;

public class Lesson {

    public static void main(String[] args) {
        array();

//        ex1();

    }

    private static void ex1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько чисел вы хотите ввести?");
        int size = scanner.nextInt();

        int[] numbers = new int[size];


        // for ( управляющий_индекс ; условие ; изменение_индекса )
        for (int i = 0; i < size; i++){ // i++ -> i = i + 1
            System.out.println("Введите число " + (i+1) + " :");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Вы ввели: ");
        for (int i = 0; i < size; i++){
            System.out.println(numbers[i]);
        }
    }

    private static void array() {
        String[] names = new String[3]; // [null,null,null]
        //                              0 1 2
        int[] numbers = new int[3]; // [0,0,0]
        int[] numbers2 = {1,2,3}; // альтернава
        numbers2[0] = 10; // [10, 0, 0]
        numbers2[1] = 100; // [10, 100, 0]
        numbers2[2] = 1000; // [10, 100, 1000]
//        numbers[3] = 10000; // [10, 100, 1000] todo Ошибка!

        System.out.println(numbers.length);
    }
}
