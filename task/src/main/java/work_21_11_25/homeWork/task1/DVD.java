package work_21_11_25.homeWork.task1;
/// TODO дисплэй инфо
public class DVD extends LibraryItem {
    private String director;
    private int durationMinutes;
    private String genre;
    private int minimumAge;

    public DVD(int publicationYear,
               String title,
               String id,
               String director,
               int durationMinutes,
               String genre,
               int minimumAge){

        super(id, title, publicationYear);

        this.director = director;
        this.durationMinutes = durationMinutes;
        this.genre = genre;
        this.minimumAge = minimumAge;
    }

    @Override
    public double calculateLateFee(int daysLate) {
        return daysLate * 20.0;
    }

    public boolean canBorrow(int age) {
        if (age > minimumAge) {
            System.out.println("Приятного просмотра ");
            return true;
        } else {
            System.out.println("Гуляй молодой ");
            return false;
        }

    }
}
