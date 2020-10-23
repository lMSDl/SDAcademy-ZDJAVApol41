package pl.sdacademy.JavaAdvanced.ex21;

public class Qube extends ThreeDShape {

    private double a;

    public Qube(double a) {
        this.a = a;
    }

    @Override
    public double calculateVolume() {
        return a * a * a;
    }

    @Override
    public double calculatePerimeter() {
        return 12 * a;
    }

    @Override
    public double calculateArea() {
        return 6 * a * a;
    }
}
