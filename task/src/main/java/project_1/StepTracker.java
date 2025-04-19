package project_1;
import java.util.Scanner;

public class StepTracker {
    Scanner scanner = new Scanner(System.in);
    MonthData[] monthData = new MonthData[12];
    int goalByStepsPerDay = 10000;

    public StepTracker() {
        for (int i = 0; i < monthData.length; i++) {
            monthData[i] = new MonthData();
        }
    }

    public void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца (1-12):");
        int month = scanner.nextInt();
    }

    public void changeStepGoal() {
        System.out.println("Введите новую цель шагов:");
        int newGoal = scanner.nextInt();
        if (newGoal > 0) {
            goalByStepsPerDay = newGoal;
        } else {
            System.out.println("Цель должна быть больше 0");
        }
    }

    int sumStepsFromMonth(int month) {
        int sum = 0;
        int[] days = monthData[month - 1].day;
        for (int steps : days) {
            sum += steps;
        }
        return sum;
    }
    int maxSteps(int month) {
        int max = 0;
        int[] days = monthData[month -1].day;
        for (int steps : days) {
            if (steps > max) max = steps;
        }
        return max;
    }
    int bestSeries(int goal, int month) {
        int currentSeries = 0, bestSeries = 0;
        int[] days =monthData[month -1].day;
        for (int steps : days) {
            if (steps >= goal) currentSeries++;
            else currentSeries = 0;
            bestSeries = Math.max(bestSeries, currentSeries);
        }
        return bestSeries;
    }
}

