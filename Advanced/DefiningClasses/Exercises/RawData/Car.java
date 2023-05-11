package DefiningClasses.Exercises.RawData;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;
    private List<Tire> tires;
    private double averageTiresPressure;

    public Car(String model, int speed, int power, int weight, String type, double pressure1, int age1,
               double pressure2, int age2,double pressure3, int age3,double pressure4, int age4) {
        this.model = model;
        this.engine = new Engine(speed,power);
        this.cargo = new Cargo(weight,type);
        this.tires = new ArrayList<>();
        this.tires.add(new Tire(pressure1,age1));
        this.tires.add(new Tire(pressure2,age2));
        this.tires.add(new Tire(pressure3,age3));
        this.tires.add(new Tire(pressure4,age4));
    }

    public Cargo getCargo() {
        return cargo;
    }

    public List<Tire> getTires() {
        return tires;
    }

    public void setAverageTiresPressure() {
        double pressureSum = 0;
        for (Tire tire : tires) {
            pressureSum += tire.getPressure();
        }
        averageTiresPressure = pressureSum/4;
    }

    public double getAverageTiresPressure() {
        return averageTiresPressure;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }
}
