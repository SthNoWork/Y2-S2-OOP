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
            continue;
        }
        System.out.println("Output is: ");
        AbstractMath.reverseNumber(option);
    }

    static void roundedNumber(Scanner input) {
        System.out.println("::: Reverse a number :::");
        System.out.println("Input number: ");
        System.out.println("Output is: ");
        AbstractMath.roundedNumber(option);
    }

    static void countDistinct(Scanner input) {
        System.out.println("::: Reverse a number :::");
        System.out.println("Input number: ");
        System.out.println("Output is: ");
        AbstractMath.countDistinct();
    }

    static void decimalToBinary(Scanner input) {
        System.out.println("::: Reverse a number :::");
        System.out.println("Input number: ");
        System.out.println("Output is: ");
        AbstractMath.decimalToBinary(option);

    }

}
