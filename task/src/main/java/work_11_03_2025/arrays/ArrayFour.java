package work_11_03_2025.arrays;
//это четвертое
import java.util.Arrays;

public class ArrayFour {
    public static void main(String[] args) {

        int n = 3;
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = i + 1;
        }

        //до реверса
        System.out.println("Массив до реверса: " + Arrays.toString(array));

        //для реверса
        reverseArray(array);

        //после реверса
        System.out.println("Массив после реверса: " + Arrays.toString(array));
    }

    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        // Меняем местами
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}

