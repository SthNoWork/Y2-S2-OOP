package ex1;

import java.util.Scanner;

public class Main {
    static GeometryArea area = new GeometryArea();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while (true) {
            System.out.println();
            System.out.println("==== Shape Area Calculation ===");
            System.out.println("1.  Rectangle");
            System.out.println("2.  Circle");
            System.out.println("3.  Triangle (three sides)");
            System.out.println("4.  Triangle (base and height)");
            System.out.println("5.  Semi circle");
            System.out.println("6.  Sector");
            System.out.println("7.  Quit");
            System.out.print("Choose an opt: ");

            choice = getChoice("Choose an option: ");

            switch (choice) {
                case 1:
                    handleRectangle();
                    break;
                case 2:
                    handleCircle();
                    break;
                case 3:
                    handleTriangleThreeSides();
                    break;
                case 4:
                    handleTriangleBaseHeight();
                    break;
                case 5:
                    handleSemicircle();
                    break;
                case 6:
                    handleSector();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    static int getChoice(String prompt) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while (true) {
            System.out.print(prompt);
            try {
                choice = Integer.parseInt(sc.nextLine());
                return choice;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }

    static double getDouble(String prompt) {
        Scanner sc = new Scanner(System.in);
        double choice = 0;
        while (true) {
            System.out.print(prompt);
            try {
                choice = Double.parseDouble(sc.nextLine());
                return choice;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }

    static void handleRectangle() {
        double length = 0, width = 0, areaValue = 0;
        System.out.println();
        System.out.println("==== Rectangle Area Calculation ===");
        length = getDouble("Enter length: ");
        width = getDouble("Enter width: ");
        areaValue = area.calcuateRectangleArea(length, width);
        System.out.println("Area of Rectangle: " + areaValue);
    }

    static void handleCircle() {
        System.out.println("==== Circle Area Calculation ===");
        double radius = getDouble("Enter radius: ");
        double areaValue = area.calcuateCircleArea(radius);
        System.out.println("Area of Circle: " + areaValue);
    }

    static void handleTriangleThreeSides() {
        System.out.println("==== Triangle Area Calculation (Three Sides) ===");
        double a = getDouble("Enter side a: ");
        double b = getDouble("Enter side b: ");
        double c = getDouble("Enter side c: ");
        double areaValue = area.calcuateTraingleArea(a, b, c);
        System.out.println("Area of Triangle: " + areaValue);
    }

    static void handleTriangleBaseHeight() {
        System.out.println("==== Triangle Area Calculation (Base and Height) ===");
        double base = getDouble("Enter base: ");
        double height = getDouble("Enter height: ");
        double areaValue = area.calcuateTraingleArea(base, height);
        System.out.println("Area of Triangle: " + areaValue);
    }

    static void handleSemicircle() {
        System.out.println("==== Semi Circle Area Calculation ===");
        double radius = getDouble("Enter radius: ");
        double areaValue = area.calcuateSemicirleArea(radius);
        System.out.println("Area of Semi Circle: " + areaValue);
    }

    static void handleSector() {
        System.out.println("==== Sector Area Calculation ===");
        double radius = getDouble("Enter radius: ");
        double angle = getDouble("Enter angle (in degrees): ");
        double areaValue = area.calcuateSectorArea(radius, angle);
        System.out.println("Area of Sector: " + areaValue);
    }
}
