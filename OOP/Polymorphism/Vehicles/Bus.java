package Polymorphism.Vehicles;

public class Bus extends Vehicle {

    private static final double ADDITIONAL_CONSUMPTION_WHEN_FULL = 1.4;

    public Bus(double fuelQuantity, double fuelConsumption, int tankCapacity) {
        super(fuelQuantity, fuelConsumption, ADDITIONAL_CONSUMPTION_WHEN_FULL, tankCapacity);
    }

    public void setEmptyBusConsumption() {
        super.setFuelConsumption(getFuelConsumption(),(-ADDITIONAL_CONSUMPTION_WHEN_FULL));
    }

    public void setFullBusConsumption() {
        super.setFuelConsumption(getFuelConsumption(),ADDITIONAL_CONSUMPTION_WHEN_FULL);
    }
}
