package ex2;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankManagement bank = new BankManagement();

        // Pre-load sample accounts matching the lab console
        bank.addAccount(new Account("00000000111", "Mesa Mina", 403.34));
        bank.addAccount(new Account("00000000222", "Tola Kompheak", 803.34));
        bank.addAccount(new Account("00000000333", "Tola Mokara", 603.34));
        bank.addAccount(new Account("000000004444", "Tola Seyha", 203.34));

        int opt = 0;
        while (opt != 6) {
            System.out.println(":::: The Bank ::::");
            System.out.println("1. Account List");
            System.out.println("2. Create an account");
            System.out.println("3. Deposit to an account");
            System.out.println("4. Withdraw from an account");
            System.out.println("5. Transfer to another account");
            System.out.println("6. Quit");
            System.out.print("Choose an opt: ");
            opt = sc.nextInt();
            sc.nextLine();

            try {
                if (opt == 1) {
                    bank.displayAccounts();

                } else if (opt == 2) {
                    System.out.print("ACC_ID: ");
                    String id = sc.nextLine();
                    System.out.print("ACC_HOLDER: ");
                    String name = sc.nextLine();
                    System.out.print("ACC_BALANCE: ");
                    String balStr = sc.nextLine();
                    double bal = BankManagement.parseAndValidateAmount(balStr);
                    bank.createAccount(id, name, bal);

                } else if (opt == 3) {
                    System.out.print("ACC_ID: ");
                    String id = sc.nextLine();
                    System.out.print("Amount: ");
                    String amtStr = sc.nextLine();
                    double amt = BankManagement.parseAndValidateAmount(amtStr);
                    bank.deposit(id, amt);

                } else if (opt == 4) {
                    System.out.print("ACC_ID: ");
                    String id = sc.nextLine();
                    System.out.print("Amount: ");
                    String amtStr = sc.nextLine();
                    double amt = BankManagement.parseAndValidateAmount(amtStr);
                    bank.withdraw(id, amt);

                } else if (opt == 5) {
                    System.out.print("From ACC_ID: ");
                    String from = sc.nextLine();
                    System.out.print("To ACC_ID: ");
                    String to = sc.nextLine();
                    System.out.print("Amount: ");
                    String amtStr = sc.nextLine();
                    double amt = BankManagement.parseAndValidateAmount(amtStr);
                    bank.transfer(from, to, amt);
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

            System.out.println();
        }

        System.out.println("Goodbye!");
        sc.close();
    }
}
