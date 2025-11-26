package work_21_11_25.homeWork.task1;

public abstract class LibraryItem {
    protected String id;
    protected String title;
    protected int publicationYear;
    protected boolean isAvailable;
    protected String currentBorrower;

    public LibraryItem(String id,
                       String title,
                       int publicationYear) {
        this.id = id;
        this.title = title;
        this.publicationYear = publicationYear;
        this.isAvailable = true;
        this.currentBorrower = null;
    }

    public boolean borrowItem(String borrowerName) {
        if (isAvailable) {
            this.currentBorrower = borrowerName;
            this.isAvailable = false;

            System.out.println("предмет выдан");
            return true;
        } else {
            System.out.println("Недоступен для выдачи");
            return false;
        }
    }
    public boolean returnItem(){
        if (isAvailable){
            System.out.println("Книга уже в библиотеке ");
            return false;
        }
        this.isAvailable = true;
        this.currentBorrower = null;
        System.out.println("Материал возвращен");
        return true;

    }

    public void displayInfo(){
        System.out.println("Уникальный идентификатор " + id);
        System.out.println("Название " + title);
        System.out.println("Год написания " + publicationYear);
        System.out.println("Статус " + isAvailable);
        System.out.println("Кто взял " + currentBorrower);
    }

    public abstract double calculateLateFee(int daysLate);


}
