package pl.sdacademy.JavaAdvanced.ex9;

import pl.sdacademy.JavaAdvanced.ex10.I_Movable;
import pl.sdacademy.JavaAdvanced.ex10.MoveDirection;

public class Point2D implements I_Movable {
    private double x;
    private double y;

    @Override
    public void move(MoveDirection moveDirection) {
        x=x+moveDirection.getX();
        y=y+moveDirection.getY();
    }

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
