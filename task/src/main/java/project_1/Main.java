package project_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();

        while (true) {

            printMenu();

            System.out.println("Введите команду: ");
            int command = scanner.nextInt();

            switch (command) {
                case 1:

                    stepTracker.addNewNumberStepsPerDay();
                    break;
                case 2:

                    stepTracker.changeStepGoal();
                    break;
                case 3:

                    System.out.println("Введите месяц (1-12):");
                    int month = scanner.nextInt();

                    if (month >= 1 && month <= 12) {
                        stepTracker.printStatistic(month);
                    } else {
                        System.out.println("Некорректный номер месяца");
                    }
                    break;
                case 4:
                    System.out.println("Выход из программы.");

                    scanner.close();
                    return;
                default:
                    System.out.println("Неизвестная команда. Попробуйте снова.");
            }
        }
    }

    public static void printMenu() {

        System.out.println("1. Ввод шагов за день.");
        System.out.println("2. Изменить цель шагов.");
        System.out.println("3. Вывести статистику за месяц.");
        System.out.println("4. Выйти.");
    }
}