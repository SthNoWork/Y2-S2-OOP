package Ex10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {

            System.out.println("=== Math Menu ===");
            System.out.println("1. Addition (+)");
            System.out.println("2. Substruction (-)");
            System.out.println("3. Multiplication (x)");
            System.out.println("4. Division (/)");
            System.out.println("5. Quit");
            System.out.print("Please choose an option: ");

            int option = input.nextInt();

            if (option < 1 || option > 5) {
                System.out.println("Please choose an option again.");
                continue;
            }

            if (option == 5) {
                running = false;
                break;
            }

            System.out.print("Please input value A: ");
            double A = input.nextDouble();

            System.out.print("Please input value B: ");
            double B = input.nextDouble();

            switch (option) {
                case 1:
                    System.out.println("=== Addition (+)===");
                    System.out.println("Answer of A + B = " + (A + B));
                    break;

                case 2:
                    System.out.println("=== Substruction (-)===");
                    System.out.println("Answer of A - B = " + (A - B));
                    break;

                case 3:
                    System.out.println("=== Multiplication (x)===");
                    System.out.println("Answer of A x B = " + (A * B));
                    break;

                case 4:
                    System.out.println("=== Division (/)===");
                    if (B == 0) {
                        System.out.println("Cannot divide by zero.");
                    } else {
                        System.out.println("Answer of A / B = " + (A / B));
                    }
                    break;
            }

            System.out.print("Do you want to continue? If no go to Menu.\n");
            System.out.print("Input your answer (y/n): ");
            char ans = input.next().charAt(0);

            if (ans == 'n' || ans == 'N') {
                running = false;
            }
        }

        input.close();
    }
}
