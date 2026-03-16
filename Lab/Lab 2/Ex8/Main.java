/*
❖ Lab02.8. Minimum value
Write a program to find a minimum value among A, B, C, D and E
Console:
Input value of A: 34
Input value of B: 77
Input value of C: 12
Input value of D: 99
Input value of E: 12
The smallest number among A, B, C, D, and E is: 12 
*/

package Ex8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input value of A: ");
        int A = input.nextInt();

        System.out.print("Input value of B: ");
        int B = input.nextInt();

        System.out.print("Input value of C: ");
        int C = input.nextInt();

        System.out.print("Input value of D: ");
        int D = input.nextInt();

        System.out.print("Input value of E: ");
        int E = input.nextInt();

        input.close();
        
        int min = A;

        if (B < min) min = B;
        if (C < min) min = C;
        if (D < min) min = D;
        if (E < min) min = E;

        System.out.println("The smallest number among A, B, C, D, and E is: " + min);
    }
}
