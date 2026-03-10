package Ex5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program for calculating equation 1/x = 1/y + 1/z to find value of x");
        
        System.out.print("Please input y: ");
        double y = input.nextDouble();

        System.out.print("Please input z: ");
        double z = input.nextDouble();

        double x = (y * z) / (y + z);

        System.out.println("Result x = " + x);
    }
}