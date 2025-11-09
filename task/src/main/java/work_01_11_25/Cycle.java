package work_01_11_25;

import java.util.List;

public class Cycle {
    public static void main(String[] args) {

        /**                          i  j
         *первая кол-во строк       [9][1]
         *второе кол-во столбцов    [5][6]
         *                          [1][3]
         */
//        int[][] nums = new int[2][2]; // [[],[]]
//        nums[0][0] = 9;
//        nums[0][1] = 1;
//        nums[1][0] = 5;
//        nums[1][1] = 6;
//        int[][] nums = {
//                {9,1},
//                {5,6}
//
//       };
//
//        for (int i = 0; i<nums.length; i++){
//
//            for (int j = 0; j<nums[i].length; j++){
//                System.out.print(nums[j][i] +" ");
//            }
//            System.out.println();
//        }
        int[][] qwe = {
                {1,9,3,8,3},
                {9,2,5,6,8},
                {6,7,2,4,9},
                {1,3,7,9,3},
                {4,5,8,1,5}
        };
        for (int q = 0; q< qwe.length; q++){
            System.out.println(qwe[q][q]);
        }

    }
}
