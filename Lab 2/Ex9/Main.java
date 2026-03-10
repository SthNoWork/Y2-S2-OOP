package Ex9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        char choice = 'y';
        int index = 0;

        while (choice == 'y' || choice == 'Y') {
            System.out.print("Input value in Array at index " + index + ": ");
            int value = input.nextInt();
            arr.add(value);

            System.out.print("Do you want to add more (y/n)?: ");
            choice = input.next().charAt(0);

            index++;
        }

        input.close();
        
        int max = Collections.max(arr);

        System.out.println("The biggest number among in Array is: " + max);
    }
}
