package pl.sdacademy.JavaAdvanced.ex9;

public class Main {
    public static void main(String[] args) {

        Point2D pierwszy = new Point2D(0,10);
        Point2D drugi = new Point2D(0,0);
        Circle kolo = new Circle(pierwszy, drugi);
        System.out.println(kolo.getRadius());
        System.out.println(kolo.getArea());
        System.out.println(kolo.getPerimeter());
    }
}
