package work_09_03_2025;

import work_06_03_2025.Cat;

import java.util.ArrayList;
import java.util.List;


/*
Создать список из целых чисел, заполнить его любыми значениями.
Проверить, содержит ли список число 100.
Найти индекс числа 50, если оно есть в списке, и удалить его.
Вывести итоговый список и его размер.

* */
public class Lesson {

    public static void main(String[] args) {
//        List<String> names = new ArrayList<>(); // []
//        names.add("Ann");
//        names.add("Vasya");
//        names.add("Peter");
//
//        names.set(1, "George");
//
//        String name = names.get(0);
//
//        names.clear();
//
//        List<Cat> cats = new ArrayList<>();
//        cats.add(new Cat());
        

        List<Integer> numbers = new ArrayList<>(); // [] -> размер 0
        for (int i=1; i<=100; i++){ //мин макс шаг
            numbers.add(i);
        }

//        for(Integer number : numbers){
//            if(number == 100){
//                System.out.println("Переменная найдена");
//                break;
//            }
//        }

        // проверяем, есть ли в списке число 100
        if(numbers.contains(100)){
            System.out.println("Переменная найдена");
        }else {
            System.out.println("Переменная не найдена");
        }

//        int foundIndex = -1;
//        for (int i = 0; i<numbers.size(); i++){
//            if(numbers.get(i) == 50){
//                foundIndex = i;
//            }
//        }
        int foundIndex = numbers.indexOf(50);

        if(foundIndex!= -1){
            numbers.remove(foundIndex);
            System.out.println("Число 50 удалено");
        }else {
            System.out.println("Число 50 не найдено");
        }

        System.out.println("Итоговый список: " + numbers);
        System.out.println("Размер списока: " + numbers.size());
    }
}
