package pl.sdacademy.JavaAdvanced.ex9;

public class Circle {

    private Point2D center;
    private Point2D point;

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
    }

    public double getRadius(){
        return Math.sqrt(Math.pow((center.getX() - point.getX()),2) + Math.pow(center.getY()-point.getY(),2));
    }

    public double getPerimeter(){
        return Math.PI*2*getRadius();
    }
    public double getArea(){
        return Math.PI*getRadius()*getRadius();
    }
}
