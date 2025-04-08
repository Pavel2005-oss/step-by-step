package work_11_03_2025.Cycles;

import java.util.Random;

public class Cycles {
    public static void main(String[] args) {
        cycles();

    }

    /**
     * Сумма чисел от 1 до n
     * Считать n.
     * С помощью цикла for вычислить сумму всех целых чисел от 1 до n.
     * Вывести результат.
     */
    public static void cycles () {
        Random random = new Random();
        int number = random.nextInt();
        int n = 0;
        if (number > 0 ){
            for (int i = 1; i <= number; i++){
                n += i;
            }
        }else
            System.out.println("Число отрицательное");

        System.out.println("результат -> " + n);

    }
}
