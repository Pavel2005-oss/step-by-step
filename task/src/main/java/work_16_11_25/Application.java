package work_16_11_25;

public class Application {
    public static void main(String[] args) {
        Book book1 = new Book("Война и мир","Толстой Л.Н.", 1274);
        Book book2 = new Book("Сапёр","Мазалов П.А.", 123);
        Book book3 = new Book("Жопа","Иванов И.И. ", 639);

        book3.displayInfo();

    }
}
