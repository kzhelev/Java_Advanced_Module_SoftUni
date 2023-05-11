package Inheritance.Restaurant;

public class Main {
    public static void main(String[] args) {

        Coffee coffee = new Coffee("cake", 30);
        System.out.println(coffee.getName()+" "+ coffee.getCaffeine() +" "+ coffee.getMilliliters() +" "+ coffee.getPrice());
        System.out.println();

    }
}
