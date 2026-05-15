package ex2;

import java.util.Scanner;

public class Main {
    static Randomizer random = new Randomizer();

    public static void main(String[] args) {
        while (true) {
            System.out.println();
            System.out.println("==== Number Randomizer ===");
            System.out.println("1.  In between");
            System.out.println("2.  Unique in between");
            System.out.println("3.  Quit");
            int choice = getChoice("Choose an option: ");

            switch (choice) {
                case 1:
                    handleRandomizeInBetween();
                    break;
                case 2:
                    handleRandomizeUniqueInBetween();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    static void handleRandomizeInBetween() {
        System.out.println();
        System.out.println("=== Randomize In Between ===");
        int min = getChoice("Enter minimum value: ");
        int max = getChoice("Enter maximum value: ");
        int result = random.randomizeInBetween(min, max);
        System.out.println("Randomized number: " + result);
    }

    static void handleRandomizeUniqueInBetween() {
        System.out.println();
        System.out.println("=== Randomize Unique In Between ===");
        int min = getChoice("Enter minimum value: ");
        int max = getChoice("Enter maximum value: ");
        int amount = getChoice("Enter the number of unique values to generate: ");
        int[] result = random.randomizeUniqueInBetween(min, max, amount);
        System.out.println("Randomized numbers: " + java.util.Arrays.toString(result));
    }

    static int getChoice(String prompt) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while (true) {
            System.out.print(prompt);
            try {
                choice = Integer.parseInt(sc.nextLine());
                return choice;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }
}