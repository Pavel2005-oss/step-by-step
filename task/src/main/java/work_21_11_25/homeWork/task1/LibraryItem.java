package work_21_11_25.homeWork.task1;

public class LibraryItem {
    protected String id;
    protected String title;
    protected int publicationYear;
    protected boolean isAvailable;
    protected String currentBorrower;

    public LibraryItem(String id, String title, int publicationYear, boolean isAvailable, String currentBorrower) {
        this.id = id;
        this.title = title;
        this.publicationYear = publicationYear;
        this.isAvailable = isAvailable;
        this.currentBorrower = currentBorrower;
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


}
