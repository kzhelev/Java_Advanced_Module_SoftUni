package Polymorphism.Shapes;

public class Rectangle extends Shape {

    private Double height;
    private Double width;

    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;
        calculatePerimeter();
        calculateArea();
    }

    public final Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public final Double getWidth() {
        return width;
    }

    public void setWeight(Double weight) {
        this.width = weight;
    }

    @Override
    public void calculatePerimeter() {
         setPerimeter(2 * (height + width));
    }

    @Override
    public void calculateArea() {
        setArea(height * width);
    }
}
