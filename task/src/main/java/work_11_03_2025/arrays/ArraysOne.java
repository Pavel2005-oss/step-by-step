package work_11_03_2025.arrays;

/*
Создайте массив целых чисел (например, длиной 1000) и заполните его случайными значениями.

Найдите сумму всех элементов и среднее арифметическое.

Выведите результат на экран.
 */

public class ArraysOne {
        public static void main(String[] args) {
            int[] numbers = new int[10]; //массив длиной в 10
            numbers[0] = 1;
            numbers[1] = 2;
            numbers[2] = 3;
            numbers[3] = 4;
            numbers[4] = 5;
            numbers[5] = 6;
            numbers[6] = 7;
            numbers[7] = 8;
            numbers[8] = 9;
            numbers[9] = 10;


            int sum = 0;

            for (int i = 0; i < 11 ; i++)
                sum += numbers[i];//сумма массива

            float sumSr = (float) sum / 10;//среднее арифметиченское

            System.out.println("сумма массива -> " + sum);
            System.out.println("среднее арифметическое -> " + sumSr);
        }
}
