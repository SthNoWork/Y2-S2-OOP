package ex1;

public class GeometryArea extends ShapeArea {
    @Override
    double calcuateRectangleArea(double width, double height) {
        return width * height;
    }

    @Override
    double calcuateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    @Override
    double calcuateTraingleArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    double calcuateTraingleArea(double base, double height) {
        return 0.5 * base * height;
    }

    @Override
    double calcuateSemicirleArea(double radius) {
        return 0.5 * Math.PI * radius * radius;
    }

    @Override
    double calcuateSectorArea(double radius, double angle) {
        return 0.5 * Math.PI * radius * radius * (angle / 360);
    }
}
