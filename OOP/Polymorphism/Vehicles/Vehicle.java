package Polymorphism.Vehicles;

import java.text.DecimalFormat;

public class Vehicle {
    protected double fuelQuantity;
    private double fuelConsumption;
    protected double tankCapacity;

    public Vehicle(double fuelQuantity, double fuelConsumption, double consumptionMore, int tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        setFuelConsumption(fuelConsumption, consumptionMore);
        this.tankCapacity = tankCapacity;
    }

    public void drive(double kmToDrive) {
        if (kmToDrive * getFuelConsumption() > fuelQuantity) {
            System.out.printf("%s needs refueling\n",getClass().getSimpleName());
        } else {
            fuelQuantity -= kmToDrive * getFuelConsumption();
            DecimalFormat decimalFormat = new DecimalFormat("##.##");
            System.out.printf("%s travelled %s km\n",getClass().getSimpleName(), decimalFormat.format(kmToDrive));
        }
    }

    public void refuel(double fuelAdded, double percentsIn) {
        if (fuelAdded <= 0) {
            throw new IllegalArgumentException("Fuel must be a positive number");
        }

        if (fuelQuantity + fuelAdded > tankCapacity) {
            System.out.println("Cannot fit fuel in tank");
        } else {
            fuelQuantity += fuelAdded * (percentsIn / 100);
        }
    }

    public void refuel(double fuelAdded) {
        refuel(fuelAdded, 100);
    }

    protected void setFuelConsumption(double fuelConsumption, double consumptionMore) {
        this.fuelConsumption = fuelConsumption + consumptionMore;
    }

    protected double getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", getClass().getSimpleName(), fuelQuantity);
    }
}
