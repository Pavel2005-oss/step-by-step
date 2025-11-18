package work_17_11_25.home;
/*
 * Задание 2: Класс "Студент"
 *
 * Создайте класс Student со следующими полями:
 * - String name (имя)
 * - int age (возраст)
 * - double averageGrade (средний балл)
 *
 * Требования:
 * 1. Создайте конструктор с параметрами
 * 2. Создайте метод isExcellent(), который возвращает true, если средний балл >= 4.5
 * 3. Создайте метод introduce(), который выводит: "Привет, меня зовут [имя], мне [возраст] лет"
 * 4. Создайте 2 студентов и проверьте, кто из них отличник
 */
public class Student {
    private String name;
    private int age;
    private double averageGrade;

    public Student (String name, int age, double averageGrade){
        this.name = name;
        this.age = age;
        this.averageGrade = averageGrade;
    }

}
