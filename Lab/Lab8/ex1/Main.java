package ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GridManagement gm = new GridManagement();

        int opt = 0;
        while (opt != 7) {
            gm.displayGrid();
            System.out.println("1. Update a single cell");
            System.out.println("2. Insert at a row");
            System.out.println("3. Insert at a column");
            System.out.println("4. Clear at a row");
            System.out.println("5. Clear at a column");
            System.out.println("6. Clear all");
            System.out.println("7. Quit");
            System.out.print("Choose an opt: ");
            opt = sc.nextInt();

            if (opt == 1) {
                System.out.print("Row: ");   int r = sc.nextInt();
                System.out.print("Col: ");   int c = sc.nextInt();
                System.out.print("Value: "); int v = sc.nextInt();
                gm.updateCell(r, c, v);

            } else if (opt == 2) {
                System.out.print("Row number: "); int r = sc.nextInt();
                int[] vals = new int[7];
                System.out.print("Enter 7 values: ");
                for (int i = 0; i < 7; i++) vals[i] = sc.nextInt();
                gm.insertAtRow(r, vals);

            } else if (opt == 3) {
                System.out.print("Column number: "); int c = sc.nextInt();
                int[] vals = new int[7];
                System.out.print("Enter 7 values: ");
                for (int i = 0; i < 7; i++) vals[i] = sc.nextInt();
                gm.insertAtColumnFlat(c, vals);

            } else if (opt == 4) {
                System.out.print("Row number: "); int r = sc.nextInt();
                gm.clearAtRow(r);

            } else if (opt == 5) {
                System.out.print("Column number: "); int c = sc.nextInt();
                gm.clearAtColumn(c);

            } else if (opt == 6) {
                gm.clear();
            }
        }

        System.out.println("Goodbye!");
        sc.close();
    }
}