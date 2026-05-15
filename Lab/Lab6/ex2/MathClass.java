package ex2;

public class MathClass {
    static double sum(double a, double b) { return a + b; }
    static double sum(double a, double b, double c) { return a + b + c; }
    static double sum(double[] arr) {
        double s = 0;
        for (double v : arr) s += v;
        return s;
    }

    static double multiply(double a, double b) { return a * b; }
    static double multiply(double a, double b, double c) { return a * b * c; }
    static double multiply(double[] arr) {
        double p = 1;
        for (double v : arr) p *= v;
        return p;
    }

    static double max(double a, double b, double c) { return Math.max(a, Math.max(b, c)); }
    static double max(double a, double b, double c, double d) { return Math.max(Math.max(a, b), Math.max(c, d)); }
    static double max(double[] arr) {
        double m = arr[0];
        for (double v : arr) if (v > m) m = v;
        return m;
    }

    static double min(double a, double b, double c) { return Math.min(a, Math.min(b, c)); }
    static double min(double a, double b, double c, double d) { return Math.min(Math.min(a, b), Math.min(c, d)); }
    static double min(double[] arr) {
        double m = arr[0];
        for (double v : arr) if (v < m) m = v;
        return m;
    }

    static double average(double a, double b, double c) { return sum(a, b, c) / 3; }
    static double average(double a, double b, double c, double d) { return (a + b + c + d) / 4; }
    static double average(double[] arr) { return sum(arr) / arr.length; }
}

