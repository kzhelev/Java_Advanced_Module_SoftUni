package Exam.automotiveRepairShop;

import java.util.ArrayList;
import java.util.List;

public class RepairShop {

    private int capacity;
    private List<Vehicle> vehicles;

    public RepairShop(int capacity) {
        this.capacity = capacity;
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        if (vehicles.size() < capacity) {
            vehicles.add(vehicle);
        }
    }

    public boolean removeVehicle(String vin) {

        Vehicle vehicle = vehicles.stream().filter(e -> e.getVIN().equals(vin)).findFirst().orElse(null);

        if (vehicle == null) {
            return false;
        } else {
            return vehicles.remove(vehicle);
        }
    }

    public int getCount() {
        return vehicles.size();
    }

    public Vehicle getLowestMileage() {
        return vehicles.stream().min((e, e1) -> e.getMileage() - e1.getMileage()).orElse(null);
    }

    public String report() {

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Vehicles in the preparatory:\n");

        vehicles.forEach(e -> stringBuilder.append(e+"\n"));

        return stringBuilder.toString();
    }
}
