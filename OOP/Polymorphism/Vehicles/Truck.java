package Polymorphism.Vehicles;

import java.text.DecimalFormat;

public class Truck extends Vehicle {

    private static final double ADDITIONAL_CONSUMPTION = 1.6;
    private static final double FUEL_LOSSES_PERCENT = 5;

    public Truck(double fuelQuantity, double fuelConsumption, int tankCapacity) {
        super(fuelQuantity, fuelConsumption, ADDITIONAL_CONSUMPTION, tankCapacity);
    }

    @Override
    public void refuel(double fuelAdded, double percentsIn) {
        super.refuel(fuelAdded, 100 - FUEL_LOSSES_PERCENT);
    }

}
