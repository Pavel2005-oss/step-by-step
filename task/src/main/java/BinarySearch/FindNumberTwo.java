package BinarySearch;

import java.util.Arrays;
import java.util.Random;

/*
Первый блок
создать массив из 10 элементов
заполнить его случайными значениями

Второй блок
упорядочить элементы в нём
выбрать один элемент который мы будем искать

Третий блок
используя бинарный поиск найти этот элемент
вывести полученный результат
 */
public class FindNumberTwo {
    public static void main(String[] args) {
        /// БЛОК ОДИН
        int[] array = new int[10];// создали массив из 10 элементов
        Random random = new Random();// добавляет случайность

        for (int i = 0; i < 10; i++) {//идёт по массиву от нуля до 10 с шагом в 1
            array[i] = random.nextInt(100);//в массив заносится случайное число от 0 до 99
        }
        System.out.println("Массив: " + Arrays.toString(array));//выводит данные массива, а не адрес на данные

        /// БЛОК ДВА
        Arrays.sort(array);// упорядочил массив
        System.out.println("Отсортированный массив: "+Arrays.toString(array));

        int targetIndex = random.nextInt(array.length);  // индекс который мы ищем
        int target = array[targetIndex];                 // значение!
        System.out.println("Ищем: " + target);

        /// БЛОК ТРИ

        int index = binarySearch(array, target);
        if (index != -1) {
            System.out.println("Элемент найден: " + target);
        } else {
            System.out.println("Элемент НЕ НАЙДЕН");
        }
    }
    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] == target) {
                return mid;
            }
            else if (array[mid] < target) {
                low = mid + 1;
            }
            else if (array[mid] > target) {
                high = mid - 1;
            }

        }
        return -1;
    }
}
