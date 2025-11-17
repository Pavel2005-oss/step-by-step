package work_16_11_25;
/*
 * Задание 1: Класс "Книга"
 *
 * Создайте класс Book со следующими полями:
 * - String title (название)
 * - String author (автор)
 * - int pages (количество страниц)
 *
 * Требования:
 * 1. Создайте конструктор, который принимает все три параметра
 * 2. Создайте метод displayInfo(), который выводит информацию о книге
 * 3. В методе main создайте 3 разные книги и выведите информацию о каждой
 *
 * Пример вывода:
 * Книга: "Война и мир", Автор: Толстой Л.Н., Страниц: 1274
 */
public class Book {
    private String title;
    private String author;
    private int pages;

    public Book(String title, String author, int pages) {
        this.author = author;
        this.title = title;
        this.pages = pages;

    }

    public void displayInfo() {
        System.out.println("Название книги " + title + " Автор " + author + "Страниц " + pages);

    }
}



