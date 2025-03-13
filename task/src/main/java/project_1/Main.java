package project_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
}
