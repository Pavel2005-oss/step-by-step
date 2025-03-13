package work_04_03_25;
/*

Создайте массив из пяти целых чисел [10, 3, 45, 2, 15].

Найдите минимальное значение в массиве с помощью цикла for.
 */
public class Work {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 3;
        numbers[2] = 45;
        numbers[3] = 2;
        numbers[4] = 15;

        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Минимальное значение: " + min);
    }

}
