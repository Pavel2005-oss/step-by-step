package March.март.work_13_03_25;

import java.util.Scanner;

public class Lesson {


    public static void main(String[] args) {

        int[] array = readArray();

        int sum = calculateSum(array);
        int min = findMin(array);
        int max = findMax(array);
        double average = calculateAverage(array);

        printResult(sum, average, min, max);

    }

    private static void printResult(int sum, double average, int min, int max) {
        System.out.println("Сумма элементов: " + sum);
        System.out.println("Среднее значение: " + average);
        System.out.println("Минимум: " + min);
        System.out.println("Максимум: " + max);
    }

    private static int[] readArray(){
        Scanner scanner = new Scanner(System.in);

        //Считываем размер массива
        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();

        // Создаем массив
        int[] array = new int[n];

        // Считываем элементы массива
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        scanner.close();

        return array;
    }

    private static int calculateSum(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    private static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    private static int findMax(int[] array){

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    private static double calculateAverage(int[] array){
        double average = 0;
        if (array.length > 0) {
            average = (double) calculateSum(array) / array.length;
        }
        return average;
    }

}
