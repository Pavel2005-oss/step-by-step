package work_01_11_25;

public class task_5 {
    /*
    Задание 5: Чётные числа
Выведите все чётные числа от 1 до 20.

Подсказка: Используйте оператор % (остаток от деления). Если число % 2 == 0, то число чётное.
     */
    public static void main(String[] args) {
        for (int n = 1; n<=20;n++){
            if ( n %2 == 0 ) {
                System.out.println(n);
            }
        }
    }
}
