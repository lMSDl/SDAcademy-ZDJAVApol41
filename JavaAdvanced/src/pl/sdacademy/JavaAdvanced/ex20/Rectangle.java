package pl.sdacademy.JavaAdvanced.ex20;

public class Rectangle extends Shape{

    double a;
    double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    protected double calculatePerimeter() {
        return 2*a+2*b;
    }

    @Override
    protected double calculateArea() {
        return a*b;
    }
}
