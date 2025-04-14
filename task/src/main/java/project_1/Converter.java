package project_1;

public class Converter {
    public static double convertStepsToKm(int steps) {
        return (steps * 75) / 100000.0; // преобразование шагов в километры
    }

    public static double convertStepsToKilocalories(int steps) {
        return (steps * 50) / 1000.0; // преобразование шагов в килокалории
    }

    public static void printStatistics(StepTracker stepTracker, int month) {
        int sum = stepTracker.sumStepsFromMonth(month);
        int max = stepTracker.maxSteps(month);
        int daysCount = stepTracker.monthData[month - 1].day.length; // Предполагая, что days - это массив шагов
        double average = (double) sum / daysCount;
        double distance = convertStepsToKm(sum);
        double calories = convertStepsToKilocalories(sum);

        System.out.println("Статистика за месяц " + month + ":");
        System.out.println("Сумма шагов: " + sum);
        System.out.println("Максимальные шаги: " + max);
        System.out.println("Среднее количество шагов: " + average);
        System.out.println("Дистанция (в километрах): " + distance);
        System.out.println("Калории: " + calories);
    }
}

