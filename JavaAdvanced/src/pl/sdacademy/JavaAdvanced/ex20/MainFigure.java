package pl.sdacademy.JavaAdvanced.ex20;

public class MainFigure {
    public static void main(String[] args) {

        Hexagon hexagon = new Hexagon(2);
        System.out.println("hexagon.calculateArea() = " + hexagon.calculateArea());
        System.out.println("hexagon.calculatePerimeter() = " + hexagon.calculatePerimeter());

        Triangle triangle = new Triangle(1,2,3);
        System.out.println("triangle.calculateArea() = " + triangle.calculateArea());
        System.out.println("triangle.calculatePerimeter() = " + triangle.calculatePerimeter());

        Rectangle rectangle = new Rectangle(2, 5);
        System.out.println("rectangle.calculateArea() = " + rectangle.calculateArea());
        System.out.println("rectangle.calculatePerimeter() = " + rectangle.calculatePerimeter());

    }
}
