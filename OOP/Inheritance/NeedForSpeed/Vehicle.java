package Inheritance.NeedForSpeed;

public class Vehicle {

    final static double DEFAULT_FUEL_CONSUMPTION = 1.25;
    private double fuelConsumption;
    private double fuel;
    private int horsePower;

    public Vehicle(double fuel, int horsePower) {
        this.fuel = fuel;
        this.horsePower = horsePower;
        setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }

    public void setFuelConsumption(double defaultConsumption) {
        this.fuelConsumption = defaultConsumption;
    }

    public double getFuel() {
        return fuel;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void drive(double km) {

        double fuelNeeded = km * fuelConsumption;

        if (fuelNeeded > fuel) {
            throw new IllegalArgumentException("Not enough fuel for this ride!");
        }

        fuel -= fuelNeeded;
    }



}
