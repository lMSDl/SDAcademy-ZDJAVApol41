package pl.sdacademy.JavaAdvanced.ex20;

public class Rectangle extends Shape{

    double a;
    double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double calculatePerimeter() {
        return 2*a+2*b;
    }

    @Override
    double calculateArea() {
        return a*b;
    }
}
