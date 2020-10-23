package pl.sdacademy.JavaAdvanced.ex20;

public class Hexagon extends Shape {

    private double a;

    public Hexagon(double a) {
        this.a = a;
    }

    @Override
    double calculatePerimeter() {
        return 6*a;
    }

    @Override
    double calculateArea() {
        return (3*a*a*Math.sqrt(3))/2;
    }
}
