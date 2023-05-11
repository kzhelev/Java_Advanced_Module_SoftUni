package DefiningClasses.Exercises.SpeedRacing;

import java.text.DecimalFormat;
import java.util.Map;

public class Car {
    private String model;
    private double fuelAmount;
    private double fuelCostPerKm;
    private double distanceTraveled;

    public Car(String model, double fuelAmount, double fuelCostForKm) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCostPerKm = fuelCostForKm;
        distanceTraveled = 0.0;
    }

    public boolean hasEnoughFuel(double distanceToTravel) {
        double possibleDistance = this.fuelAmount / this.fuelCostPerKm;
        return distanceToTravel <= possibleDistance;
    }

    public void setDistanceTraveled(double distanceToTravel) {
        this.distanceTraveled = this.distanceTraveled + distanceToTravel;
    }

    public double getDistanceTraveled() {
        return distanceTraveled;
    }

    public void newFuelAmount(double distanceToTravel) {
        this.fuelAmount = this.fuelAmount - distanceToTravel*this.fuelCostPerKm;
    }

    public void driveCar(Map<String, Car> cars, String carModel, double distanceToTravel) {
        if (cars.get(carModel).hasEnoughFuel(distanceToTravel)) {
            cars.get(carModel).newFuelAmount(distanceToTravel);
            cars.get(carModel).setDistanceTraveled(distanceToTravel);
        } else {
            System.out.println("Insufficient fuel for the drive");
        }
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        return String.format("%s %.2f %s",this.model,this.fuelAmount,decimalFormat.format(this.distanceTraveled));
    }
}
