package March.work_13_03_25;
import java.util.Scanner;

public class Task_1_solve {

    public static void main(String[] args) {
        String input = readInput();
        String cleaned = cleanString(input);

        boolean result = isPalindrome(cleaned);

        printResult(result);

    }

    private static boolean isPalindrome(String cleaned) {
        // считаем, что строка изначально является палиндромом (true)
        boolean isPalindrome = true;

        // Устанавливаем указатели на первый и последний символ строки
        int left = 0;
        int right = cleaned.length() - 1;

        //  цикл выполняется до тех пор пока указатели не встретятся
        while (left < right) {

            // если не совпали, то не палиндром
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                isPalindrome = false;
                break;
            }

            // сдвиг указателей навстречу друг к другу
            left++;
            right--;
        }

        return isPalindrome;

    }

    private static String readInput(){
        // создаем сканер для чтения строки из консоли
        Scanner scanner = new Scanner(System.in);

        // чтение введеной строки в переменную
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        // закрываем сканер
        scanner.close();
        return input;
    }

    private static String cleanString(String input){
        // Убираем из строки все, кроме букв (латиница и кириллица)
        // и приводим результат к нижнему регистру
        return input.replaceAll("[^a-zA-Zа-яА-Я]", "").toLowerCase();

    }

    private static void printResult(boolean isPalindrome){
        // Вывод результата
        if (isPalindrome) {
            System.out.println("Строка является палиндромом");
        } else {
            System.out.println("Строка не является палиндромом");
        }
    }
}
