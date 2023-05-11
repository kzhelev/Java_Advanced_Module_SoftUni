package Polymorphism.Shapes;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.0);
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());
        Rectangle rectangle = new Rectangle(3.0,5.0);
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getArea());
    }
}
