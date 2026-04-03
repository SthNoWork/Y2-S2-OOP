package ex6;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("==== Menu ===");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Quit");
            System.out.print("Choose an option: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    auth.login(input);
                    break;
                case 2:
                    auth.register(input);
                    break;
                case 3:
                    return;
            }
            System.out.println();
        }
    }
}