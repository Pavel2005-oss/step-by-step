package March.март.work_11_03_25.arrays;

/*
Создайте массив целых чисел (например, длиной 1000) и заполните его случайными значениями.

Найдите сумму всех элементов и среднее арифметическое.

Выведите результат на экран.
 */

import java.util.Random;

public class ArraysOne {
        public static void main(String[] args) {
            Random random = new Random();

            int[] numbers = new int[10]; //массив длиной в 10

            for (int i = 0; i < numbers.length ; i++ ){
                int rand = random.nextInt();
                numbers[i] = rand;
            }

            int sum = 0;

            for (int i = 0; i < numbers.length ; i++) {
                sum += numbers[i];//сумма массива
            }

            float sumSr = (float) sum / 10;//среднее арифметиченское

            System.out.println("сумма массива -> " + sum);
            System.out.println("среднее арифметическое -> " + sumSr);
        }
}
