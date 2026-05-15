package ex2;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    static double[] readMany() {
        System.out.print("How many values? ");
        int n = sc.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Value " + (i + 1) + ": ");
            arr[i] = sc.nextDouble();
        }
        return arr;
    }

    static double[] read(int count) {
        double[] arr = new double[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Value " + (i + 1) + ": ");
            arr[i] = sc.nextDouble();
        }
        return arr;
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n==== Menu ===");
            System.out.println("1. Sum of two values");
            System.out.println("2. Sum of three values");
            System.out.println("3. Sum of many values");
            System.out.println("4. Multiply of two values");
            System.out.println("5. Multiply of three values");
            System.out.println("6. Multiply of many values");
            System.out.println("7. Max of two values");
            System.out.println("8. Max of three values");
            System.out.println("9. Max of many values");
            System.out.println("10. Min of two values");
            System.out.println("11. Min of three values");
            System.out.println("12. Min of many values");
            System.out.println("13. Average of two values");
            System.out.println("14. Average of three values");
            System.out.println("15. Average of many values");
            System.out.println("16. Quit");
            System.out.print("Choice: ");

            int choice = sc.nextInt();
            if (choice == 16)
                break;

            double[] v;
            double result;

            switch (choice) {
                case 1:
                    v = read(2);
                    result = MathClass.sum(v[0], v[1]);
                    break;
                case 2:
                    v = read(3);
                    result = MathClass.sum(v[0], v[1], v[2]);
                    break;
                case 3:
                    result = MathClass.sum(readMany());
                    break;
                case 4:
                    v = read(2);
                    result = MathClass.multiply(v[0], v[1]);
                    break;
                case 5:
                    v = read(3);
                    result = MathClass.multiply(v[0], v[1], v[2]);
                    break;
                case 6:
                    result = MathClass.multiply(readMany());
                    break;
                case 7:
                    v = read(3);
                    result = MathClass.max(v[0], v[1], v[2]);
                    break;
                case 8:
                    v = read(4);
                    result = MathClass.max(v[0], v[1], v[2], v[3]);
                    break;
                case 9:
                    result = MathClass.max(readMany());
                    break;
                case 10:
                    v = read(3);
                    result = MathClass.min(v[0], v[1], v[2]);
                    break;
                case 11:
                    v = read(4);
                    result = MathClass.min(v[0], v[1], v[2], v[3]);
                    break;
                case 12:
                    result = MathClass.min(readMany());
                    break;
                case 13:
                    v = read(3);
                    result = MathClass.average(v[0], v[1], v[2]);
                    break;
                case 14:
                    v = read(4);
                    result = MathClass.average(v[0], v[1], v[2], v[3]);
                    break;
                case 15:
                    result = MathClass.average(readMany());
                    break;
                default:
                    System.out.println("Invalid choice.");
                    continue;
            }

            System.out.println("Result: " + result);
        }
    }
}