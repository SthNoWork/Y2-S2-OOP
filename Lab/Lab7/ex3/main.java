package ex3;

import java.util.Scanner;

public class Main {
    static Randomizer random = new Randomizer();

    public static void main(String[] args) {
        int choice = 0;
        while (true) {
            System.out.println("==== Text Randomizer ===");
            System.out.println("1.  A Character");
            System.out.println("2.  A String");
            System.out.println("3.  Unique Strings");
            choice = getChoice("Choose an opt:");

            switch (choice) {
                case 1:
                    handleRandomizeACharacter();
                    break;
                case 2:
                    handleRandomizeAString();
                    break;
                case 3:
                    handleRandomizeUniqueStrings();
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    static void handleRandomizeACharacter() {
        char result = random.randomizeACharacter();
        System.out.println("Randomized character: " + result);
    }

    static void handleRandomizeAString() {
        int length = getChoice("Enter the length of the string: ");
        String result = random.randomizeAString(length);
        System.out.println("Randomized string: " + result);
    }

    static void handleRandomizeUniqueStrings() {
        int length = getChoice("Enter the length of the strings: ");
        int amount = getChoice("Enter the number of unique strings to generate: ");
        String[] result = random.randomizeStrings(length, amount);
        System.out.println("Randomized strings: " + java.util.Arrays.toString(result));
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