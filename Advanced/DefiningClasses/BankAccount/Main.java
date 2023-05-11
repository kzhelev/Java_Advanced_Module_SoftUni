package DefiningClasses.BankAccount;

import java.text.DecimalFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, BankAccount> bankAccounts = new HashMap<>();

        String input = scanner.nextLine();

        DecimalFormat decimalFormat = new DecimalFormat("##.####");
        DecimalFormat decimalFormat2 = new DecimalFormat("##.####");

        while (!input.equals("End")) {
            String[] command = input.split("\\s+");
            int idNumber;

            switch (command[0]) {
                case "Create":
                    BankAccount bankAccount = new BankAccount();
                    bankAccounts.put(bankAccount.getClientId(),bankAccount);
                    System.out.printf("Account ID%d created%n",bankAccount.getClientId());
                    break;

                case "Deposit":
                    makeDeposit(bankAccounts, decimalFormat, command);
                    break;

                case "SetInterest":
                    double interest = Double.parseDouble(command[1]);
                    BankAccount.setInterestRate(interest);
                    break;

                case "GetInterest":
                    getInterest(bankAccounts, command);
                    break;
            }
            input = scanner.nextLine();
        }
    }

    private static void getInterest(Map<Integer, BankAccount> bankAccounts, String[] command) {
        int idNumber;
        idNumber = Integer.parseInt(command[1]);
        int years = Integer.parseInt(command[2]);
        if (bankAccounts.size() < idNumber || idNumber < 1) {
            System.out.println("Account does not exist");
        } else {
            double interest = bankAccounts.get(idNumber).getInterest(years);
            System.out.printf("%.2f%n", interest);
        }
    }

    private static void makeDeposit(Map<Integer, BankAccount> bankAccounts, DecimalFormat decimalFormat, String[] command) {
        int idNumber;
        idNumber = Integer.parseInt(command[1]);
        double amount = Double.parseDouble(command[2]);
        if (bankAccounts.size() < idNumber || idNumber < 1) {
            System.out.println("Account does not exist");
        } else {
            bankAccounts.get(idNumber).deposit(amount);
            System.out.printf("Deposited %s to ID%d%n", decimalFormat.format(amount), idNumber);
        }
    }
}
