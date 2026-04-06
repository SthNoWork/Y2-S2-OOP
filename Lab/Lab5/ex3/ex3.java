package ex3;

import java.util.*;

abstract class Shape {
    abstract void draw(int index);
}

class Line extends Shape {
    int length;

    Line(int l) {
        length = l;
    }

    void draw(int index) {
        System.out.println(index + ". length: " + length);
        System.out.println("_".repeat(length));
    }
}

class Rectangle extends Shape {
    int w, h;

    Rectangle(int w, int h) {
        this.w = w;
        this.h = h;
    }

    void draw(int index) {
        System.out.println(index + ". Width: " + w + ", Height: " + h);
        for (int i = 0; i < h; i++) {
            if (i == 0 || i == h - 1 || w <= 2) {
                System.out.println("*".repeat(w));
            } else {
                System.out.println("*" + " ".repeat(w - 2) + "*");
            }
        }
    }
}

class Triangle extends Shape {
    int w, h;

    Triangle(int w, int h) {
        this.w = w;
        this.h = h;
    }

    void draw(int index) {
        System.out.println(index + ". Width: " + w + ", Height: " + h);
        for (int i = 1; i <= h; i++) {
            if (i == 1 || i == h) {
                System.out.println("*".repeat(i));
            } else {
                System.out.println("*" + " ".repeat(i - 2) + "*");
            }
        }
    }
}

public class ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Shape> shapes = new ArrayList<>();

        while (true) {
            System.out.println("==== Menu ===");
            System.out.println("1. View all lines");
            System.out.println("2. View all rectangles");
            System.out.println("3. View all triangles");
            System.out.println("4. Add a new shape");
            System.out.println("5. Quit");
            System.out.print("Choose an opt: ");

            int opt = Integer.parseInt(input.nextLine());

            if (opt == 1) {
                System.out.println("==== List all lines ====");
                int idx = 1;
                for (Shape s : shapes)
                    if (s instanceof Line)
                        s.draw(idx++);
            } else if (opt == 2) {
                System.out.println("==== List all rectangles ====");
                int idx = 1;
                for (Shape s : shapes)
                    if (s instanceof Rectangle)
                        s.draw(idx++);
            } else if (opt == 3) {
                System.out.println("==== List all triangles ====");
                int idx = 1;
                for (Shape s : shapes)
                    if (s instanceof Triangle)
                        s.draw(idx++);
            } else if (opt == 4) {
                System.out.println("==== Add new shape ====");
                System.out.println("Select a shape:");
                System.out.println("1. Line");
                System.out.println("2. Rectangle");
                System.out.println("3. Triangle");
                System.out.print("Choose an opt: ");

                int type = Integer.parseInt(input.nextLine());
                if (type == 1) {
                    System.out.print("Input length: ");
                    shapes.add(new Line(Integer.parseInt(input.nextLine())));
                } else if (type == 2 || type == 3) {
                    System.out.print("Input width: ");
                    int w = Integer.parseInt(input.nextLine());
                    System.out.print("Input height: ");
                    int h = Integer.parseInt(input.nextLine());
                    shapes.add(type == 2 ? new Rectangle(w, h) : new Triangle(w, h));
                }
            } else {
                break;
            }
        }
    }
}