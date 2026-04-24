package ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;
        while (true) {
            System.out.println("==== Menu ===");
            System.out.println("1. Reverse a number");
            System.out.println("2. Rounded number");
            System.out.println("3. Count distinct number");
            System.out.println("4. Decimal to Binary");
            System.out.println("5. Quit");
            System.out.println("Choose an opt: ");
            try {
                option = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error!");
                continue;
            }

            if (option == 5) {
                System.out.println("Goodbye!");
                break;
            }

            switch (option) {
                case 1:
                    reverseNumber(input);
                    break;
                case 2:
                    roundedNumber(input);
                    break;
                case 3:
                    countDistinct(input);
                    break;
                case 4:
                    decimalToBinary(input);
                    break;
                default:
                    System.out.println("Error!");
                    break;
            }
        }
    }

    static void reverseNumber(Scanner input) {
        int num;
        System.out.println("::: Reverse a number :::");
        System.out.println("Input number: ");
        try {
            num = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Error!");
            return;
        }
        System.out.println("Output is: " + AbstractMath.reverseNumber(num));
    }

    static void roundedNumber(Scanner input) {
        double num;
        System.out.println("::: Rounded number :::");
        System.out.println("Input number: ");
        try {
            num = Double.parseDouble(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Error!");
            return;
        }
        System.out.println("Output is: " + AbstractMath.roundedNumber(num));
    }

    static void countDistinct(Scanner input) {
        System.out.println("::: Count distinct number :::");
        System.out.println("Input numbers separated by spaces: ");
        String line = input.nextLine().trim();
        if (line.isEmpty()) {
            System.out.println("Output is: 0");
            return;
        }

        String[] parts = line.split("\\s+");
        int[] values = new int[parts.length];
        try {
            for (int i = 0; i < parts.length; i++) {
                values[i] = Integer.parseInt(parts[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Error!");
            return;
        }

        System.out.println("Output is: " + AbstractMath.countDistinct(values));
    }

    static void decimalToBinary(Scanner input) {
        int decimal;
        System.out.println("::: Decimal to Binary :::");
        System.out.println("Input number: ");
        try {
            decimal = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Error!");
            return;
        }
        System.out.println("Output is: " + AbstractMath.decimalToBinary(decimal));

    }

}
