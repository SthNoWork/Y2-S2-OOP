package ex4;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("==== Menu ===");
            System.out.println("1. View my note");
            System.out.println("2. Edit");
            System.out.println("3. Quit");
            System.out.print("Choose an option: ");
            int opt = sc.nextInt();
            sc.nextLine();

            if (opt == 1)
                Note.view();
            else if (opt == 2)
                Note.editMenu(sc);
            else if (opt == 3)
                break;
        }
    }
}