package work_27_05_25;



import java.math.BigDecimal;

public class BankAccount {
    public static void main(String[] args) {

    }
}

abstract class Account {
    private BigDecimal balance;

    public Account(double initialBalance) {
        this.balance = new BigDecimal(initialBalance);
    }

    protected abstract double calculateFee(double amount);

    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Сумма должна быть положительной");
        balance = balance.add(new BigDecimal(amount));
    }

    public void withdraw(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Сумма должна быть положительной");

        double fee = calculateFee(amount);
        double total = amount + fee;

        if (balance.compareTo(new BigDecimal(total)) < 0) {
            throw new IllegalArgumentException("Недостаточно средств");
        }

        balance = balance.subtract(new BigDecimal(total));
    }

    public double getBalance() {
        return balance.doubleValue();
    }
}

class CheckingAccount extends Account {
    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    protected double calculateFee(double amount) {
        return amount * 0.01; // 1% комиссия
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    protected double calculateFee(double amount) {
        return 0; // Без комиссии
    }
}

class DepositAccount extends Account {
    public DepositAccount(double initialBalance) {
        super(initialBalance);
    }

    protected double calculateFee(double amount) {
        if (getBalance() - amount < 50000) {
            return amount * 0.005; // 0.5% комиссия если ост < 50000
        }
        return 0;
    }
}