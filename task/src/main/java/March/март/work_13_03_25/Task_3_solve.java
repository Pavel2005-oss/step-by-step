package March.март.work_13_03_25;
import java.util.Scanner;

public class Task_3_solve {
    public static void main(String[] args) {
        int[][] matrix = createAndFillMatrix();
        rows(matrix);
        cols(matrix);
    }

    private static int[][] createAndFillMatrix() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число строк: ");
        int rows = scanner.nextInt();
        System.out.print("Введите число столбцов: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        scanner.close();
        return matrix;
    }

    private static void rows(int[][] matrix) {
        System.out.println("Суммы по строкам:");
        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Строка " + i + ": " + rowSum);
        }
    }

    private static void cols(int[][] matrix) {
        System.out.println("Суммы по столбцам:");
        for (int j = 0; j < matrix[0].length; j++) {
            int colSum = 0;
            for (int i = 0; i < matrix.length; i++) {
                colSum += matrix[i][j];
            }
            System.out.println("Столбец " + j + ": " + colSum);
        }
    }
}
