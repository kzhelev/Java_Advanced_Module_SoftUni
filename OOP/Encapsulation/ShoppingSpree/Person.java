package Encapsulation.ShoppingSpree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {

    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        this.products = new ArrayList<>();
    }

    private void setName(String name) {
        if (name.trim().length() < 1) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setMoney(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void buyProduct(Product product) {

        if (money >= product.getCost()) {
            products.add(product);
            money -= product.getCost();
            System.out.printf("%s bought %s%n", this.name, product.getName());
        } else {
            throw new IllegalArgumentException(String.format("%s can't afford %s%n",name,product.getName()));
        }

    }

    @Override
    public String toString() {
        if (products.size() == 0) {
            return String.format("%s - Nothing bought.",name);
        } else {
            String products = this.products.stream().map(Product::getName).collect(Collectors.joining(", "));

            return String.format("%s - %s",name,products);
        }
    }
}
