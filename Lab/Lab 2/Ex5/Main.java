/*
❖ Lab02.5. Equation
Write a program in Java to calculate value of x in a formula below:
Where y and z are given by user from keyboard. Suppose that x, y, z are non-zero.
Example:
Console:
Program for calculating equation 1/x = 1/y + 1/z to find value of x
Please input y: 2.25
Please input z: 2
Result x = 1.0588236
*/

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