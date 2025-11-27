package work_21_11_25.homeWork.task1;
/// TODO реализовать классы
public class Magazine extends LibraryItem {
    private int issueNumber;
    private String month;
    private String publisher;

    public Magazine (String id,
                     String title,
                     int publicationYear,
                     int issueNumber,
                     String month,
                     String publisher){

        super(id, title, publicationYear);

        this.issueNumber = issueNumber;
        this.month = month;
        this.publisher = publisher;

    }

    @Override
    public double calculateLateFee(int daysLate) {
        return 0;
    }
}
