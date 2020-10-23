package pl.sdacademy.JavaAdvanced.ex20;

public class Triangle extends Shape {
    double a;
    double b;
    double h;

    public Triangle(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    double calculatePerimeter() {
        return a + 2 * b;
    }

    @Override
    double calculateArea() {
        return 0.5 * a * h;
    }
}
