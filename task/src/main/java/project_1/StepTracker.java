package project_1;

public class StepTracker {
    MonthData[] monthData = new MonthData[12];

    public StepTracker (){
        for (int i = 0;i < monthData.length; i++){
            monthData[i] = new MonthData();
        }
    }

    public void addNewNumberStePerDay() {
        System.out.println("Введите номер месяца от одного до двенадцати:  ");

    }

}
