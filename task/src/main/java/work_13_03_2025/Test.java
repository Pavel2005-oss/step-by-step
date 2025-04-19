package work_13_03_2025;


public class Test {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {1, 1, 1},
                {3, 2, 1,}
        };
        for (int i = 0; i < 3; i++) {
            int rowSum = 0;
            for (int j = 0; j < 3; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Строка " + i + ": " + rowSum);
        }


    }
}

/*


        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Строка " + i + ": " + rowSum);
        }

        1)
        i = 0
        rows = 3
        roySum=0
            1.1
            j=0
            cols = 3


 */