package work_21_11_25.homeWork.task1;
/// null
public class ReferenceBook extends Book {
    private String department;
    private boolean isRareEdition;
    private String currentReader;

    public ReferenceBook(String author,
                         int pages,
                         String isbn,
                         String id,
                         String title,
                         int publicationYear,
                         String genre,
                         String department,
                         boolean isRareEdition){

        super(author, pages, isbn, id, title, publicationYear, genre);

        this.department = department;
        this.isRareEdition = isRareEdition;
        this.currentReader = null ;

    }

    @Override
    public boolean borrowItem(String borrowerName) {
        System.out.println("Справочную лит. выдать невозможно");
        return false;
    }
    @Override
    public double calculateLateFee(int daysLate){
        return 0;
    }
    public boolean readInLibrary(String readerName){
        if (this.currentReader != null) {
            System.out.println("Уже читают, сорян");
            return false;
        }

        this.currentReader = readerName;
        System.out.println("Читатель начал читать! ");

        return true;
    }
}
