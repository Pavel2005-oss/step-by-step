package project_1;
import java.util.Scanner;

public class StepTracker {
    MonthData[] monthData = new MonthData[12];

    public StepTracker (){
        for (int i = 0;i < monthData.length; i++){
            monthData[i] = new MonthData();
        }
    }
//
//    public void addNewNumberStePerDay() {
//        System.out.println("Введите номер месяца от одного до двенадцати:  ");
//
//        int month = scanner.nextInt();
//        int goalByStepsPerDay = 10000;
//    }
//    public int sumStepsFromMonth() {
//        int sum = 0;
//        for (int steps : days) {
//            sum += steps;
//        }
//        return sum;
//    }
//    int maxSteps() {
//        int max = 0;
//        for (int steps : days) {
//            if (steps > max) max = steps;
//        }
//        return max;
//    }
//    public void changeStepGoal() {
//        System.out.println("Введите новую цель шагов:");
//        int newGoal = scanner.nextInt();
//        if (newGoal > 0) {
//            goalByStepsPerDay = newGoal;
//        } else {
//            System.out.println("Цель должна быть больше 0");
//        }
//
//    }
//    int bestSeries(int goal) {
//        int currentSeries = 0, bestSeries = 0;
//        for (int steps : days) {
//            if (steps >= goal) currentSeries++;
//            else currentSeries = 0;
//            bestSeries = Math.max(bestSeries, currentSeries);
//        }
//        return bestSeries;
//    }

}
