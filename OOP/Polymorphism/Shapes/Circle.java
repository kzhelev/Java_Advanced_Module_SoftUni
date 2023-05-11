package Polymorphism.Shapes;

public class Circle extends Shape {

    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
        calculatePerimeter();
        calculateArea();
    }

    public final Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    protected void calculatePerimeter() {
        setPerimeter(2 * Math.PI * radius);
    }

    @Override
    protected void calculateArea() {
        setArea(Math.PI * Math.pow(radius, 2));
    }
}
