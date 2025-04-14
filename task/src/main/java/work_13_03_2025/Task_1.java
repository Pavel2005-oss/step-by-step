package work_13_03_2025;
import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {

        // чтение информации с консоли
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        // оставляем только буквы и приводем к нижнему регистру
        String cleaned = input.replaceAll("[^a-zA-Zа-яА-Я]", "").toLowerCase();

        // флаг,показывающий, является ли строка полндромом. "анна" " 123454321" "шалаш"
        boolean isPalindrome = true;

        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                isPalindrome = false;
                break;
            }
            //шаг в Л или П
            left++;
            right--;
        }

        // возможные варианты ответа
        if (isPalindrome) {
            System.out.println("Строка является палиндромом");
        } else {
            System.out.println("Строка не является палиндромом");
        }
        scanner.close(); // загрытие аканера
    }
}
