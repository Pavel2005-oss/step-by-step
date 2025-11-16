package work_12_11_25;

import java.lang.reflect.Array;
import java.util.ArrayList;

/*
BankAccount (Банковский счёт):

Номер счёта
Имя владельца
Текущий баланс
История транзакций (массив или ArrayList)
 */
public class BankAccount {
    private String accountNumber;
    private int currentBalance ;
    private  String ownerName;
    private ArrayList<Transaction> transactionHistory;

    public BankAccount (String accountNumber, String ownerName){
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.currentBalance = 0;
        this.transactionHistory = new ArrayList<>();
    }


    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", currentBalance=" + currentBalance +
                ", ownerName='" + ownerName + '\'' +
                ", transactionHistory=" + transactionHistory +
                '}';
    }
}
