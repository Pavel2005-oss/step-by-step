package work_12_11_25;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Transaction {
    private String type;
    private double sum;
    private LocalDateTime dateTime;
    private String description;

    public Transaction(String type, double sum, String description) {
        this.type = type;
        this.sum = sum;
        this.dateTime = LocalDateTime.now();
        this.description = description;
    }


    @Override
    public String toString() {
        return "Transaction{" +
                "type='" + type + '\'' +
                ", sum=" + sum +
                ", dateTime=" + dateTime +
                ", description='" + description + '\'' +
                '}';
    }
}
