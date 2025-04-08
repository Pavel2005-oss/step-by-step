package work_11_03_2025.Operators;
import java.util.Scanner;
public class OperatorsFive {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите оценку (от 1 до 5): ");
            int mark = scanner.nextInt();

            switch (mark) {
                case 5:
                    System.out.println("Отлично");
                    break;
                case 4:
                    System.out.println("Хорошо");
                    break;
                case 3:
                    System.out.println("Удовлетворительно");
                    break;
                default:
                    System.out.println("Неудовлетворительно");
            }
        }
}
