package Ex7;

class Point {
    double x, y;
}

class Line extends Point {
    double length;
}

class Triangle extends Line {
    double base, height;
}

class Rectangle extends Triangle {
    double width;
}