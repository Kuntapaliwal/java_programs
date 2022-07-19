package java_programs;

import java.time.*;
import java.util.Date;
import java.sql.Timestamp;

enum transactionType {
    WITHDRAWL, DEPOSIT
}

class Account {
    String accountHolderName;
    double totalBalance;
    static final double interestRate = 8;
    String panNumber;
    boolean mobileBanking;
    boolean netBanking;

    Account(double balance, String name) {
        this.totalBalance = balance;
        accountHolderName = name;
    }

    Account(double balance, String name, String panNumber, boolean mobileBanking, boolean netBanking) {

        this.totalBalance = balance;
        this.accountHolderName = name;
        this.panNumber = panNumber;
        this.mobileBanking = mobileBanking;
        this.netBanking = netBanking;

    }

    public double deposit(double amount) {
        if (amount > 0)
            totalBalance += amount;
        long dateTime = System.currentTimeMillis();
        Timestamp transactionTime = new Timestamp(dateTime);
        Date date = Date.from(transactionTime.toInstant());
        System.out.println("date is like.........." + date);
        sendTransactionMesaage(amount, transactionType.DEPOSIT, LocalDateTime.now());
        return totalBalance;
    }

    public double withdraw(double amount) {
        sendTransactionMesaage(amount, transactionType.WITHDRAWL, LocalDateTime.now());
        return totalBalance - amount;

    }

    public double calculateInterest(double amount) {
        return (amount * interestRate) / 100;
    }

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public void sendTransactionMesaage(double amount, transactionType mode, LocalDateTime dateTime) {
        String message = "hello .....";

        switch (mode) {
            case WITHDRAWL:
                message = message + "withdraw amount " + amount + " total balance " + totalBalance + " at date "
                        + dateTime.toString().split("T")[0] + " at time" + dateTime.toString().split("T")[1];
                break;
            case DEPOSIT:
                message = message + "deposit amount " + amount + " total balance " + totalBalance + " at date "
                        + dateTime.toString().split("T")[0] + " at time" + dateTime.toString().split("T")[1];
                break;
            default:
                message = message + "Invalid transaction attempted at your account at time "
                        + dateTime.toString().split("T")[0] + " at time" + dateTime.toString().split("T")[1];
                break;

        }
        System.out.println(message);

    }
}

public class BankApplication {
    public static void main(String[] args) {
        Account account = new Account(100000, "jack");
        System.out.println(account.getTotalBalance());
        account.setTotalBalance(1000);
        System.out.println(account.getTotalBalance());
        System.out.println(account.deposit(100));
        System.out.println(account.getTotalBalance());
        System.out.println(account.withdraw(100));

    }
}
