/*
❖ Lab03.6.  Static functions in Math Class II
Implement an application in Java to create your Math class with following return functions/methods:
▪ factorial (one parameter of a number)
▪ rectangleSurface (two parameters Width and Height)
▪ circleSurface (one parameter of radius)
▪ max (five parameters A, B, C, D, and E)
▪ min (five parameters A, B, C, D, and E)
*/

package Ex6;

public class Main {
    public static void main(String[] args) {

    }
}

class Math {
    static int factorial(int n) {
        if (n <= 1)
            return 1;
        return n * factorial(n - 1);
    }

    static double rectangleSurface(double width, double Height) {
        return width * Height;
    }

    static double circleSurface(double radius) {
        return 3.14159 * radius;
    }

    static double max(double... values) {
        double max = values[0];
        for (double x : values) {
            if (x > max)
                max = x;
        }
        return max;
    }

    static double min(double... values) {
        double min = values[0];
        for (double x : values) {
            if (min < x)
                min = x;
        }
        return min;
    }
}
