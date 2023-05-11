package DefiningClasses.Exercises.CarSalesman;

public class EngineI {
    private String model;
    private int power;
    private int displacement = -1;
    private String efficiency = "n/a";

    public EngineI(String model, int power) {
        this.model = model;
        this.power = power;
    }

    public EngineI(String model, int power, int displacement) {
        this(model, power);
        this.displacement = displacement;
    }

    public EngineI(String model, int power, String efficiency) {
        this(model, power);
        this.efficiency = efficiency;
    }

    public EngineI(String model, int power, int displacement, String efficiency) {
        this(model, power, displacement);
        this.efficiency = efficiency;
    }

    public int getDisplacement() {
        return displacement;
    }

    public String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

    public String getEfficiency() {
        return efficiency;
    }
}
