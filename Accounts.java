package java_programs;

class Account1 {
    String accountHolder;
    double accountBalance;
    final int accNumber;
    static double rateOfInterest = 5;
    String PAN;

    public Account1(String accountHolder, double accountBalance, int accNumber, String pAN) {
        this.accountHolder = accountHolder;
        this.accountBalance = accountBalance;
        this.accNumber = accNumber;
        PAN = pAN;

    }

    @Override
    public String toString() {
        return "Account1 [PAN=" + PAN + ", accNumber=" + accNumber + ", accountBalance=" + accountBalance
                + ", accountHolder=" + accountHolder + "]";
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setPan(String pan) {
        this.PAN = pan;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public static double getRateOfInterest() {
        return rateOfInterest;
    }

    public static void setRateOfInterest(double rateOfInterest) {
        Account1.rateOfInterest = rateOfInterest;
    }

    public String getPAN() {
        return PAN;
    }

    double withdraw(double amount) {
        accountBalance -= amount;
        return accountBalance;

    }

    double Deposit(double amount) {

        if (amount >= 0)
            accountBalance += amount;

        return accountBalance;
    }

    double calculateYearlyInterest() {
        return (accountBalance * rateOfInterest) / 100;
    }

    boolean isPanLinked() {
        if (PAN.isEmpty())
            return false;
        else
            return true;
    }

}

class SBIAccount extends Account1 {
    double accOpeningBonous;

    public SBIAccount(String accountHolder, double accountBalance, int accNumber, String pAN) {
        super(accountHolder, accountBalance, accNumber, pAN);

        accOpeningBonous = isPanLinked() ? 1000 : 0;
        accountBalance += accOpeningBonous;
        setAccountBalance(accountBalance);

    }

    void linkPain(String pan) {
        accountBalance += 500;
        setAccountBalance(accountBalance);

        setPan(pan);

    }

    String displayFeatures() {
        if (isPanLinked())
            return "SBI bank is providing you 1000 bonus on opening a new bank account........Thank you.......";
        else
            return "congrulations your account is created successfully if you link pan also you will get 500 rupees bonous........";
    }
}

class ICCIAccount extends Account1 {
    double additionalInterest;

    public ICCIAccount(String accountHolder, double accountBalance, int accNumber, String pAN) {
        super(accountHolder, accountBalance, accNumber, pAN);
        if (accountBalance > 100000) {
            additionalInterest = 2;

        }

    }

    @Override
    public String toString() {
        return "ICCIAccount [additionalInterest=" + additionalInterest + "]";
    }

    String displayFeatures() {
        if (accountBalance < 250000)
            return "your account balance is lower than the minimum limit of account please add amount otherwise extra charges will be added";
        if (accountBalance > 100000)
            return "ICCI bank is providing you 2% extra interest rate for maintaing good balance";
        else
            return "congrulation for opening the account in ICCI bank";
    }

}

public class Accounts {
    public static void main(String[] args) {
        SBIAccount sbiAccount1 = new SBIAccount("John", 1000, 12345678, "HIMPK3455");
        SBIAccount sbiAccount2 = new SBIAccount("John", 1000, 12345678, "");

        System.out.println(sbiAccount1);
        System.out.println(sbiAccount1.displayFeatures());
        System.out.println(sbiAccount2);
        System.out.println(sbiAccount2.displayFeatures());
        sbiAccount2.linkPain("BNHKO098u");
        System.out.println(sbiAccount2);
    }
}
