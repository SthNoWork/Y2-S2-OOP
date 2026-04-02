/*
❖ Lab03.5.  Static functions in Math Class I
Implement an application in Java to create your Math class with following return functions/methods:
▪ add (two parameters A and B)
▪ subtract (two parameters A and B)
▪ multiply (two parameters A and B)
▪ divide (two parameters A and B)
▪ min (two parameters A and B)
▪ max (two parameters A and B)

Math.operator(x,y)
*/

package Ex5;

class Math {
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    public static double min(double a, double b) {
        return Math.min(a, b);
    }

    public static double max(double a, double b) {
        return Math.max(a, b);
    }
}