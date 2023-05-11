package DefiningClasses.CarConstructors;

public class Car {
    private String brand;
    private String model;
    private int horsePower;

    public Car(String brand,String model, int horsePower) {

        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;

    }

    public Car(String brand) {
        this(brand,"unknown", -1);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public String carInfo() {
        String info = String.format("The car is: %s %s - %d HP.",this.getBrand(),this.getModel(),this.getHorsePower());
        return info;
    }
}
