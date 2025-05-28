package March.work_18_03_25;

import java.util.Random;

public class Lesson {

    public static void main(String[] args) {
        task1();
    }

    /**
    Создайте массив целых чисел (например, длиной 1000) и заполните его случайными значениями.

    Найдите сумму всех элементов и среднее арифметическое.

    Выведите результат на экран.
     */
    public static void task1() {
        int[] numbers = new int[5]; //массив длиной в 5
        Random random = new Random();

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(100);
        }

        System.out.println("Массив: ");
        for(int num : numbers){
            System.out.print(num + " ");
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;//сумма массива
        }

        float sumSr = (float) sum / numbers.length;//среднее арифметиченское

        System.out.println("сумма массива -> " + sum);
        System.out.println("среднее арифметическое -> " + sumSr);
    }

    /**
    Создайте массив из 15 целых чисел.

    Определите минимальный и максимальный элементы массива.

    Выведите найденные значения и их индексы.
 */
    public static void task2() {
            // Создаем массив из 15 чисел
            int[] array = new int[15];
            Random random = new Random();

            for(int i = 0; i < array.length; i++){
                array[i] = random.nextInt(100);
            }


            //создание мин и макс переменных
            int min = array[0];
            int max = array[0];
            int minIndex = 0;
            int maxIndex = 0;

            // Поиск мин и макс
            for (int i = 1; i < array.length; i++) {

                if (array[i] < min) {
                    min = array[i];
                    minIndex = i;
                }

                if (array[i] > max) {
                    max = array[i];
                    maxIndex = i;
                }
            }
            System.out.println("Минимальный элемент: " + min + ", индекс: " + minIndex);
            System.out.println("Максимальный элемент: " + max + ", индекс: " + maxIndex);

    }
}

