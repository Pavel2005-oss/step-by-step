package work_21_11_25.homeWork.task2;
/*
 * 4. Класс DVD extends LibraryItem:
 *    - private String director
 *    - private int durationMinutes
 *    - private String genre
 *    - private int minimumAge (возрастное ограничение)
 *
 *    Методы:
 *    - конструктор
 *    - @Override calculateLateFee(int daysLate) - 20 рублей за день (дороже!)
 *    - метод canBorrow(int age) - проверяет возрастное ограничение
 *    - @Override displayInfo()
 *
 */
public class DVD {
    private String director;
    private int durationMinutes;
    private String genre;
    private int minimumAge;

    public DVD(String director,int durationMinutes,String genre,int minimumAge){
        this.director = director;
        this.durationMinutes = durationMinutes;
        this.genre = genre;
        this.minimumAge = minimumAge;
    }

    @Override
    public double calculateLateFee(int daysLate) {
        return daysLate * 20.0; // 20 рублей за день
    }

    public boolean canBorrow(int age) {
        return age >= minimumAge;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
