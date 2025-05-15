package March.март.work_11_03_25.Operators;
/*
Определение знака числа
Считать число (можно double).

Если оно больше 0 – вывести «Положительное»,
если меньше 0 – «Отрицательное», иначе – «Ноль».
 */
import java.util.Scanner;

public class OperatorsTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число-> ");
        int number = scanner.nextInt();
        if (number > 0){
            System.out.println("Положительное");
        }else if (number == 0) {
            System.out.println("Ноль");
        }else {
            System.out.println("Отрицательное");
        }
        scanner.close();

    }
}
