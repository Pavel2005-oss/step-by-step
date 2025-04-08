package work_11_03_2025.arrays;

/*
Сдвиг элементов массива
Создайте массив из 10 элементов.

Реализуйте метод, который сдвигает все элементы на 1 позицию вправо.
Последний элемент при этом перемещается в начало массива.

Выведите массив до и после сдвига.
 */
public class ArrayThree {
    public static void main(String[] args) {
        int [] numbers = {1,10,2,20,3,30,4,40,5,50};
        System.out.println("До сдвига ->");

        for (int index = 0; index < numbers.length;index++){
            System.out.println(numbers[index]);
        }

        shiftRight(numbers);
    }

    public static void shiftRight(int[] number){
        //for( int index = number.length-1; index)
    }
}
