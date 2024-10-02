public class Bank {
    public static void main(String[] args) {
    BankAccount account1 = new BankAccount(100, 1000);
    BankAccount account2 = new BankAccount(200, 1500);

    account1.updateBalance(300);
    account2.updateBalance(-400);

    account1.calcInterest();
    account2.calcInterest();
    account1.displayAccount();
    account2.displayAccount();

    double swissFrancs = 150;
    double euros = 140;

    double swissFrancToUSD = 2.2;
    double euroToUSD = 3.3;

    double convertedToUSD1 = BankAccount.convertCur(swissFrancs, swissFrancToUSD);
    account1.updateBalance(convertedToUSD1);

    double convertedToUSD2 = BankAccount.convertCur(euros, euroToUSD);
    account2.updateBalance(convertedToUSD2);

    account1.calcInterest();
    account2.calcInterest();
    account1.displayAccount();
    account2.displayAccount();
}
}
