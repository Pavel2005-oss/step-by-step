package work_01_11_25;

public class task_2 {
    /*
    Задание 2: Таблица умножения
Выведите таблицу умножения на 5 (от 5×1 до 5×10).

Ожидаемый результат:

5 x 1 = 5
5 x 2 = 10
...
5 x 10 = 50
     */
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "*" + i + "=" + (n * i));
        }
    }
}
