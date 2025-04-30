package project_1;

public class MonthData {
    int[] days = new int[30]; // [0,0,0....0]

    public int maxSteps() {

        int max = 0;
        for (int steps : days) {
            if (steps > max) max = steps;
        }
        return max;
    }
    public int bestSeries(int goal) {
        int currentSeries = 0;
        int bestSeries = 0;

        for (int steps : days) {
            if (steps >= goal) {
                currentSeries++;
            } else {
                currentSeries = 0;
            }
            bestSeries = Math.max(bestSeries, currentSeries);
        }
        return bestSeries;
    }
    public int sumStepsFromMonth() {
        int sum = 0;
        for (int steps : days) {
            sum += steps;
        }
        return sum;
    }
}
