package utils;

import java.util.Scanner;

public class InputUtils {

    static Scanner scanner = new Scanner(System.in);

    public static int getInteger(String comment) {
        while (true) {
            System.out.print(comment);
            String line = scanner.nextLine();

            try {
                return Integer.parseInt(line.trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a whole number.");
            }
        }
    }

    public static float getFloat(String comment) {
        while (true) {
            System.out.print(comment);
            String line = scanner.nextLine();

            try {
                return Float.parseFloat(line.trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a float number.");
            }
        }
    }

    public static double getDouble(String comment) {
        while (true) {
            System.out.print(comment);
            String line = scanner.nextLine();

            try {
                return Double.parseDouble(line.trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a double number.");
            }
        }
    }

    public static String getString(String comment) {
        while (true) {
            System.out.print(comment);
            String line = scanner.nextLine();

            if (!line.isEmpty()) {
                return line;
            }

            System.out.println("Invalid input. Please enter a non-empty string.");
        }
    }

    public static char getGender(String comment) {
        while (true) {
            System.out.print(comment);
            String line = scanner.nextLine();

            if (line.length() == 1) {
                char c = Character.toUpperCase(line.charAt(0));
                if (c == 'M' || c == 'F') {
                    return c;
                }
            }

            System.out.println("Invalid input. Please enter M or F.");
        }
    }

    public static char getChar(String comment) {
        while (true) {
            System.out.print(comment);
            String line = scanner.nextLine();

            if (line.length() == 1) {
                return line.charAt(0);
            }

            System.out.println("Invalid input. Please enter exactly one character.");
        }
    }

    public static int getOption(String comment, int maxOption) {
        if (maxOption < 0) {
            return 0;
        }

        while (true) {
            int option = getInteger(comment);

            if (option >= 0 && option <= maxOption) {
                return option;
            }

            System.out.println("Invalid option. Please enter a number from 0 to " + maxOption + ".");
        }
    }

    public static boolean getYesOrNo(String comment) {
        while (true) {
            char c = Character.toUpperCase(getChar(comment));
            if (c == 'Y' || c == 'N') {
                return c == 'Y';
            }
            System.out.println("Invalid input. Please enter Y or N.");
        }
    }
}