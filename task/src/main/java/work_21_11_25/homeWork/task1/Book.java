package work_21_11_25.homeWork.task1;

public class Book extends LibraryItem{
    private String author;
    private int pages;
    private String isbn;
    private  String genre;//жанр

    public Book (String author,
                 int pages,
                 String isbn,
                 String id,
                 String title,
                 int publicationYear,
                 String genre){

        super(id, title, publicationYear);
        this.author = author;
        this.pages = pages;
        this.isbn = isbn;
        this.genre = genre;
    }

    @Override
    public double calculateLateFee(int daysLate){
        return daysLate * 10;
    }

    // TODO дописатььььь
    @Override
    public void displayInfo(){

    }



}
