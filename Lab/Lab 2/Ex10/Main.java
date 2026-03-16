/*
❖ Lab02.10. Math Menu
Write a program to choose menu and perform calculation based on options provided; if user choose an
incorrection option, program still keep asking to re-input a correct option number:
Console:
=== Math Menu ===
1. Addition (+)
2. Substruction (-)
3. Multiplication (x)
4. Division (/)
5. Quit
Please choose an option: 1

Console:
=== Addition (+)===
Please input value A: 3
Please input value B: 5
Answer of A + B = 8
Do you want to continue? If no go to Menu.
Input your answer (y/n): Y

Console:
=== Math Menu ===
1. Addition (+)
2. Substruction (-)
3. Multiplication (x)
4. Division (/)
5. Quit
Please choose an option: 6
W
Console:
Please choose an option again.
=== Math Menu ===
1. Addition (+)
2. Substruction (-)
3. Multiplication (x)
4. Division (/)
5. Quit
Please choose an option:
*/

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
