package project_1;
import java.util.Scanner;
ArrayIndexOutOfBoundsException
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
        int month = scanner.nextInt();
        System.out.println("Введите день месяца (1-30):");
        int days = scanner.nextInt();
        System.out.println("Введите кол-во пройденых шагов: ");
        int step = scanner.nextInt();
        monthDatas[month].days[days] = step;

    }

    public void printStatistic(StepTracker stepTracker, int month) {
        int sum = stepTracker.monthDatas.length;
        int max = stepTracker.maxSteps(month);
        int daysCount = stepTracker.monthDatas[month - 1].days.length; // Предполагая, что days - это массив шагов
        double average = (double) sum / daysCount;
        double distance = Converter.convertStepsToKm(sum);
        double calories = Converter.convertStepsToKilocalories(sum);

        System.out.println("Статистика за месяц " + month + ":");
        System.out.println("Сумма шагов: " + sum);
        System.out.println("Максимальные шаги: " + max);
        System.out.println("Среднее количество шагов: " + average);
        System.out.println("Дистанция (в километрах): " + distance);
        System.out.println("Калории: " + calories);
    }
}


