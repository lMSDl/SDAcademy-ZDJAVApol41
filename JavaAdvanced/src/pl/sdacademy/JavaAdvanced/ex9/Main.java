package pl.sdacademy.JavaAdvanced.ex9;

import pl.sdacademy.JavaAdvanced.ex10.MoveDirection;

public class Main {
    public static void main(String[] args) {

        Point2D pierwszy = new Point2D(0,10);
        Point2D drugi = new Point2D(0,0);
        Circle kolo = new Circle(pierwszy, drugi);
        System.out.println(kolo.getRadius());
        System.out.println(kolo.getArea());
        System.out.println(kolo.getPerimeter());
        MoveDirection moveDirection = new MoveDirection(3,7);
        kolo.move(moveDirection);
        kolo.resize(0.5);
        System.out.println(kolo.getRadius());
        System.out.println(kolo.getArea());
        System.out.println(kolo.getPerimeter());



    }
}
