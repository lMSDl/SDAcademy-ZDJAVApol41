package pl.sdacademy.JavaAdvanced.ex21;

public class Cone extends ThreeDShape {

    private double h;
    private double r;

    public Cone(double h, double r) {
        this.h = h;
        this.r = r;
    }

    @Override
    public double calculateVolume() {
        return (1.0 / 3) * Math.PI * r * r * h;
    }

    @Override
    public double calculatePerimeter() {
        return 2*Math.PI;
    }

    @Override
    public double calculateArea() {
        return Math.PI * r * r + Math.PI * r * h;
    }
}
