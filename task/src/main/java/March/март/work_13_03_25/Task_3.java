package March.март.work_13_03_25;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {

        // объявление сканера
        Scanner scanner = new Scanner(System.in);

        // чтение параметров матрицы
        System.out.print("Введите число строк: ");
        int rows = scanner.nextInt();
        System.out.print("Введите число столбцов: ");
        int cols = scanner.nextInt();

        //создание матрицы с заданным размером
        int[][] matrix = new int[rows][cols];

        //задаем значения матрицы
        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // вычисляем и выводим сумма по строкам
        System.out.println("Суммы по строкам:");
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Строка " + i + ": " + rowSum);
        }
        // вычисляем и выводим сумма по столбцам
        System.out.println("Суммы по столбцам:");
        for (int j = 0; j < cols; j++) {
            int colSum = 0;
            for (int i = 0; i < rows; i++) {
                colSum += matrix[i][j];
            }
            System.out.println("Столбец " + j + ": " + colSum);
        }

        scanner.close();
    }
}