package work_01_11_25;

public class task_4 {
    /*
    Задание 4: Сумма чисел
Найдите сумму всех чисел от 1 до 100.

Подсказка: Создайте переменную sum и прибавляйте к ней числа в цикле.
     */
    public static void main(String[] args) {
        int sum =0;
        for (int n = 1; n <= 100; n++ ){
            sum += n;  ///повторить Операторы присваивания
        }
        System.out.println("сумма чисел от одного до сотни " + sum);
    }
}
