public class BankAccount {
    private static final double INTEREST_RATE = 0.03;
    private int accountNum;
    private double bankBalance;
    private int duration;
    private double interest;

    public BankAccount(int accountNum, double bankBalance) {
        this.accountNum = accountNum;
        this.bankBalance = bankBalance;
        this.duration = 2;
        this.interest = INTEREST_RATE;
    }
    public void calcInterest() {
        this.interest = bankBalance * INTEREST_RATE * duration;
    }
    public void updateBalance(double amount) {
        this.bankBalance += amount;
    }
    public void displayAccount() {
        System.out.printf("Account Number: %d%n", accountNum);
        System.out.printf("Money in Bank: %.2f%n", bankBalance);
        System.out.printf("Interest Gained: %.2f%n", interest);
    }
    public int getAccountNum() {
        return accountNum;
    }
    public double getBankBalance() {
        return bankBalance;
    }
    public void setBankBalance(double bankBalance) {
        this.bankBalance = bankBalance;
    }
    public static double convertCur(double fAmount, double fEx) {
        return fAmount * fEx;
    }
}


