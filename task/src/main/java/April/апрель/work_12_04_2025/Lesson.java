package April.апрель.work_12_04_2025;

import java.util.ArrayList;
import java.util.List;

public class Lesson {

    public static void main(String[] args) {
//        add(2,5);
//        System.out.println(getAdd(2,3));
//        System.out.println(getMax(6,10));

        printMax(10, 1);
    }

    public static void add(int a, int b){
        System.out.println(a+b);
    }

    public static int getAdd(int a, int b){
        return a+b;
    }

    public static int getMax(int a, int b){
        if(a>b){
            return a;
        }
        return b;
    }

    public static void printMax(int a, int b){
        if(a>b){
            System.out.println(a);
            return;
        }
        System.out.println(b);
    }

    public static int findNegative(int[] numbers){

        for(int number:numbers){
            if(number<0){
               return number;
            }
        }
        return 0;
    }

    public static List<Integer> findPositives(Integer[] numbers){

        List<Integer> positiveNumbers = new ArrayList<>();
        for(Integer number:numbers){

            if(number==null){
                System.out.println("в массиве не должен быть null");
                break;
            }

            if(number<0){
               continue;
            }

            positiveNumbers.add(number);

        }

        return positiveNumbers;
    }



}
