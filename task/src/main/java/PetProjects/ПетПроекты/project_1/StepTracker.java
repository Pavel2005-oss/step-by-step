package PetProjects.ПетПроекты.project_1;
import java.util.Scanner;

public class StepTracker {
    Scanner scanner = new Scanner(System.in);
    MonthData[] monthDatas = new MonthData[12];
    int goalByStepsPerDay = 10000;

    public StepTracker() {
        for (int i = 0; i < monthDatas.length; i++) {
            monthDatas[i] = new MonthData();
        }
    }

    public void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца (1-12):");
        int month = scanner.nextInt() - 1;

        System.out.println("Введите день месяца (1-30):");
        int day = scanner.nextInt() - 1;

        System.out.println("Введите кол-во пройденных шагов: ");
        int steps = scanner.nextInt();

        monthDatas[month].days[day] = steps;
    }

    public void changeStepGoal() {
        System.out.println("Введите новую цель шагов:");
        int newGoal = scanner.nextInt();

        if (newGoal > 0) {
            goalByStepsPerDay = newGoal;
            System.out.println("Новая цель установлена: " + goalByStepsPerDay);
        }
    }

    public void printStatistic(int month) {

        MonthData monthData = monthDatas[month - 1];

        int sum = monthData.sumStepsFromMonth();
        int max = monthData.maxSteps();
        int bestSeries = monthData.bestSeries(goalByStepsPerDay);

        double average = (double) sum / monthData.days.length;
        double distance = Converter.convertStepsToKm(sum);
        double calories = Converter.convertStepsToKilocalories(sum);

        System.out.println("Статистика за месяц " + month + ":");
        System.out.println("Общее количество шагов: " + sum);
        System.out.println("Максимальное количество шагов: " + max);
        System.out.println("Среднее количество шагов: " + average);
        System.out.println("Пройденная дистанция (км): " + distance);
        System.out.println("Сожжённые килокалории: " + calories);
        System.out.println("Лучшая серия дней с достижением цели: " + bestSeries);
    }
}


