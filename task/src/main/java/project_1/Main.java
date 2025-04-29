package project_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printMenu();
        while (true){
            System.out.println("Введите команду: ");
            int command = scanner.nextInt();

        }
    }
    public static void printMenu(){
        System.out.println("(1) Ввод шагов за день.");
        System.out.println("(2) Изменить цель шагов.");
        System.out.println("(3) Вынести статистику за месяц.");
        System.out.println("(4) Выйти.");
    }
// добавил возможность изменения шагов
    /// надо приклееть ко 2 варианту изм. шагов
    public void changeStepGoal() {

        int goalByStepsPerDay = 10000;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите новую цель шагов:");
        int newGoal = scanner.nextInt();
        if (newGoal > 0) {
            goalByStepsPerDay = newGoal;
        } else {
            System.out.println("Цель должна быть больше 0");
        }
        scanner.close();
    }
}
