package ex1;

abstract class ShapeArea {
    abstract double calcuateRectangleArea(double width, double height);
    abstract double calcuateCircleArea(double radius);
    abstract double calcuateTraingleArea(double a, double b, double c);
    abstract double calcuateTraingleArea(double base, double height);
    abstract double calcuateSemicirleArea(double radius);
    abstract double calcuateSectorArea(double radius, double angle);
}
