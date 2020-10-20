package pl.sdacademy.JavaAdvanced.ex9;

import pl.sdacademy.JavaAdvanced.ex10.I_Movable;
import pl.sdacademy.JavaAdvanced.ex10.MoveDirection;
import pl.sdacademy.JavaAdvanced.ex11.Resizable;

public class Circle implements I_Movable, Resizable {

    private Point2D center;

    @Override
    public void move(MoveDirection moveDirection) {
        center.move(moveDirection);
        point.move(moveDirection);
    }

    private Point2D point;

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
    }

    public double getRadius() {
        return Math.sqrt(Math.pow((center.getX() - point.getX()), 2) + Math.pow(center.getY() - point.getY(), 2));
    }

    public double getPerimeter() {
        return Math.PI * 2 * getRadius();
    }

    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }

    @Override
    public void resize(double resizeFactor) {
        var moveX = point.getX()-Math.abs(center.getX() - point.getX()) * resizeFactor;
        var moveY = point.getY()-Math.abs(center.getY() - point.getY()) * resizeFactor;
        var multiplier = resizeFactor > 1 ? 1 : -1;
                MoveDirection moveDirection = new MoveDirection(multiplier*moveX, multiplier*moveY);
        point.move(moveDirection);
    }
}


//Zaimplementuj interfejs w klasie z poprzedniego zadania (Circle).
// Przy wywołaniu metody resize(double resizeFactor),
// okrąg ma zmienić swoje rozmiary o zadany współczynnik (1.5, 0.5, 10.0, itp).