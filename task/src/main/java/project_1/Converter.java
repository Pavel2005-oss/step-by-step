package project_1;

public class Converter {
    public static double convertStepsToKm(int steps) {
        return (steps * 75) / 100000.0; // преобразование шагов в километры
    }

    public static double convertStepsToKilocalories(int steps) {
        return (steps * 50) / 1000.0; // преобразование шагов в килокалории
    }

}

