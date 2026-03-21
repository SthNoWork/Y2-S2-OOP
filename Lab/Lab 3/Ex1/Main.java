/*
❖ Lab03.1.  Quadratic equation
Write a program using Function to find roots of quadratic equation  ax^2+ bx +c=0  when “a”, “b” and “c” are 
given by user input

Example01 - console:
Program for calculating roots of quadratic equation 
ax^2+ bx +c=0 
Input value of a: 2
Input value of b: 3
Input value of c: 1
X1 = -0.5, X2 = -1

Example02 - console:
Program for calculating roots of quadratic equation 
ax^2+ bx +c=0 
Input value of a: 2
Input value of b: 3
Input value of c: 4
Equation roots are complex!
*/

package Ex1;

import utils.InputUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program for calculating roots of quadratic equation");
        System.out.println("ax² + bx + c = 0");
        int a = InputUtils.getInteger("Input value of a: ");
        int b = InputUtils.getInteger("Input value of b: ");
        int c = InputUtils.getInteger("Input value of c: ");

        double delta = calcDelta(a, b, c);
        double X1, X2;
        
        if (delta < 0) {
            System.out.println("Equation roots are complex!");
        } else {
            X1 = calcRoot(a, b, c, true);
            X2 = calcRoot(a, b, c, false);
            System.out.println("X1 = " + X1 + ", X2 = " + X2);

        }

    }

    static double calcDelta(double a, double b, double c) {
        return Math.pow(b, 2) - 4 * a * c;
    }

    static double calcRoot(double a, double b, double delta, boolean isPlus) {
        if (isPlus) {
            return (-b + Math.sqrt(delta)) / (2 * a);
        } else {
            return (-b - Math.sqrt(delta)) / (2 * a);
        }
    }
}
