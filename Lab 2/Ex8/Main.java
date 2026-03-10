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
