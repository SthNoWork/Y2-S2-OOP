package ex2;

import java.util.ArrayList;

public class BankManagement {
    private ArrayList<Account> accounts = new ArrayList<>();

    private static final double MIN_BALANCE = 0.00;
    private static final double MAX_BALANCE = 10000.00;
    private static final double MAX_DEPOSIT = 1000.00;

    public void addAccount(Account a) {
        accounts.add(a);
    }

    public void displayAccounts() {
        System.out.println(":::: Account List ::::");
        for (int i = 0; i < accounts.size(); i++) {
            System.out.println("No #" + (i + 1));
            System.out.println(accounts.get(i));
        }
    }

    public void createAccount(String accId, String accHolder, double initialBalance) throws Exception {
        validateAmount(initialBalance);
        accounts.add(new Account(accId, accHolder, initialBalance));
        System.out.println("Account created successfully.");
    }

    public void deposit(String accId, double amount) throws Exception {
        if (amount <= 0 || amount > MAX_DEPOSIT)
            throw new Exception("Deposit amount must be > 0 and <= " + MAX_DEPOSIT + "$");
        Account acc = findAccount(accId);
        double newBalance = acc.getAccBalance() + amount;
        if (newBalance > MAX_BALANCE)
            throw new Exception("Balance would exceed maximum limit of " + MAX_BALANCE + "$");
        acc.setAccBalance(newBalance);
        System.out.println("Deposited " + String.format("%.2f", amount) + "$ to " + accId);
        System.out.println("New balance: " + String.format("%.2f", acc.getAccBalance()) + "$");
    }

    public void withdraw(String accId, double amount) throws Exception {
        if (amount <= 0)
            throw new Exception("Withdrawal amount must be greater than 0");
        Account acc = findAccount(accId);
        double newBalance = acc.getAccBalance() - amount;
        if (newBalance < MIN_BALANCE)
            throw new Exception("Insufficient funds. Balance cannot go below " + MIN_BALANCE + "$");
        acc.setAccBalance(newBalance);
        System.out.println("Withdrew " + String.format("%.2f", amount) + "$ from " + accId);
        System.out.println("New balance: " + String.format("%.2f", acc.getAccBalance()) + "$");
    }

    public void transfer(String fromId, String toId, double amount) throws Exception {
        if (amount <= 0)
            throw new Exception("Transfer amount must be greater than 0");
        Account from = findAccount(fromId);
        Account to = findAccount(toId);
        if (from.getAccBalance() - amount < MIN_BALANCE)
            throw new Exception("Insufficient funds for transfer");
        from.setAccBalance(from.getAccBalance() - amount);
        to.setAccBalance(to.getAccBalance() + amount);
        System.out.println("Transferred " + String.format("%.2f", amount) + "$ from " + fromId + " to " + toId);
        System.out.println(fromId + " new balance: " + String.format("%.2f", from.getAccBalance()) + "$");
        System.out.println(toId + " new balance: " + String.format("%.2f", to.getAccBalance()) + "$");
    }

    private Account findAccount(String accId) throws Exception {
        for (Account a : accounts)
            if (a.getAccId().equals(accId))
                return a;
        throw new Exception("Account not found: " + accId);
    }

    private void validateAmount(double amount) throws Exception {
        if (amount < MIN_BALANCE || amount > MAX_BALANCE)
            throw new Exception("Amount must be between " + MIN_BALANCE + "$ and " + MAX_BALANCE + "$");
    }

    public static double parseAndValidateAmount(String input) throws Exception {
        if (!input.matches("\\d+(\\.\\d{1,2})?"))
            throw new Exception("Invalid amount format. Use up to 2 decimal places (e.g. 100.50)");
        return Double.parseDouble(input);
    }
}