package tasks;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите команду от 1-10: ");
        int number = scanner.nextInt();

        if(number==1){

        } else {

        }

        switch (number){
            case 1:
            case 2:
                System.out.println("Выполнение 2 команды");
                break;
            case 3:
                System.out.println("Выполнение 3 команды");
                break;
            default:
                System.out.println("Неизвестная команда");
        }


    }
}

