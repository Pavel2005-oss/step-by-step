package work_11_03_2025.arrays;
/*
Создайте массив строк (например, из 8-10 слов).
Реализуйте метод countOccurrences(String[] arr, String target),
Который возвращает количество вхождений строки target в массив arr.
Проверьте метод с разными значениями target.
 */
public class ArrayFive {
    public static void main(String[] args) {
        String[] fruits = {"apple","orange","kiwi","apple","kiwi","apple","kiwi"};
        System.out.println(countOccurrences(fruits, "apple"));
        System.out.println(countOccurrences(fruits, "pear"));
        System.out.println(countOccurrences(fruits, "kiwi"));
    }
    public static int countOccurrences(String[] arr, String target){
        int count = 0;
        for (String word : arr) {
            if (word != null && word.equals(target)) {
                count++;
            }
        }
        return count;
    }
}
