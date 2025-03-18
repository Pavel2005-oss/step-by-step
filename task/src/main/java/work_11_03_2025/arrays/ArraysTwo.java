package work_11_03_2025.arrays;

/*
Создайте массив из 15 целых чисел.

Определите минимальный и максимальный элементы массива.

Выведите найденные значения и их индексы.
 */

public class ArraysTwo {
    public static void main(String[] args) {
        // Создаем массив из 15 чисел
        int[] array = new int[15];

        // Заполняем массив значениями
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
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
