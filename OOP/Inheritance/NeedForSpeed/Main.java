package Inheritance.NeedForSpeed;

public class Main {
    public static void main(String[] args) {

        SportCar sportCar = new SportCar(100, 100);
        sportCar.drive(10);
        System.out.println(sportCar.getFuel());
    }
}
