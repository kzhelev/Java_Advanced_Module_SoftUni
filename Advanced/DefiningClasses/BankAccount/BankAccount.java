package DefiningClasses.BankAccount;

public class BankAccount {

    private static int bankAccountCount = 1;
    private int clientId = 0;
    private double balance;
    private static double interestRate = 0.02;

    public BankAccount() {
        clientId = bankAccountCount;
        bankAccountCount++;
    }

    public static void setInterestRate(double interestNew) {
        interestRate = interestNew;
    }

    public double getInterest(int years) {
        return BankAccount.interestRate * years * balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public void deposit(double amount) {
        balance +=  amount;
    }

    public int getClientId() {
        return clientId;
    }
}
