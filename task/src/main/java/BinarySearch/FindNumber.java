package BinarySearch;

import java.sql.SQLOutput;
import java.util.Random;

/*
1 нужно зарандомить число
нужно показать какое число зарандомилось
нужно написать бинарный поиск числа
вывисти полученное число

 */
public class FindNumber {
    public static void main(String[] args) {
        Random random = new Random();//рандомайзер
        int[] array = new int[10];// создали массив из 10 элементов

        for (int i=0;i<array.length;i++){
            array[i]=random.nextInt(100);
        }//создается случайные числа от 0 до 99 в массиве

        for (int num:array){
            System.out.printf("%n" + num);
        }
    }
}
