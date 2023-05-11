package Abstraction.PointInRectangle;

public class Rectangle {
    private Point a;
    private Point c;

    public Rectangle(Point a, Point c) {
        this.a = a;
        this.c = c;
    }

    public boolean contains(Point x) {
        return x.getX() >= a.getX() && x.getX() <= c.getX() && x.getY() >= a.getY() && x.getY() <= c.getY();
    }
}
