/*
❖ Lab02.9. Maximum value
Write a program to find a maximum value among all values in an Array. Users can input values in Array as many as they want.
Console:
Input value in Array at index 0: 1
Do you want to add more (y/n)?: y
Input value in Array at index 1: 7
Do you want to add more (y/n)?: y
Input value in Array at index 2: 99
Do you want to add more (y/n)?: y
Input value in Array at index 3: 76
Do you want to add more (y/n)?: n
The biggest number among in Array is: 99
*/

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
