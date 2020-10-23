package pl.sdacademy.JavaAdvanced.ex20;

import pl.sdacademy.JavaAdvanced.ex21.Cone;
import pl.sdacademy.JavaAdvanced.ex21.Qube;

public class MainFigure {
    public static void main(String[] args) {

        Hexagon hexagon = new Hexagon(2);
        System.out.println("hexagon.calculateArea() = " + hexagon.calculateArea());
        System.out.println("hexagon.calculatePerimeter() = " + hexagon.calculatePerimeter());

        Triangle triangle = new Triangle(1, 2, 3);
        System.out.println("triangle.calculateArea() = " + triangle.calculateArea());
        System.out.println("triangle.calculatePerimeter() = " + triangle.calculatePerimeter());

        Rectangle rectangle = new Rectangle(2, 5);
        System.out.println("rectangle.calculateArea() = " + rectangle.calculateArea());
        System.out.println("rectangle.calculatePerimeter() = " + rectangle.calculatePerimeter());

        Cone cone = new Cone(2, 2);
        System.out.println("cone.calculateArea() = " + cone.calculateArea());
        System.out.println("cone.calculatePerimeter() = " + cone.calculatePerimeter());
        System.out.println("cone.calculateVolume() = " + cone.calculateVolume());

        Qube qube = new Qube(2);
        System.out.println("qube.calculateArea() = " + qube.calculateArea());
        System.out.println("qube.calculatePerimeter() = " + qube.calculatePerimeter());
        System.out.println("qube.calculateVolume() = " + qube.calculateVolume());

        System.out.print("qubeWater ");
        qube.fill(8);

        System.out.print("coneWater");
        cone.fill(8);


    }
}
