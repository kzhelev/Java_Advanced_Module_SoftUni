package DefiningClasses.Exercises.CarSalesman;

import java.text.DecimalFormat;

public class CarI {
    private String model;
    private EngineI engine;
    private double weight = -1;
    private String color = "n/a";

    public CarI(String model, EngineI engine){
        this.model = model;
        this.engine = engine;
    }

    public CarI(String model, EngineI engine, double weight){
        this(model,engine);
        this.weight = weight;
    }

    public CarI(String model, EngineI engine, String color){
        this(model,engine);
        this.color = color;
    }

    public CarI(String model, EngineI engine, double weight, String color){
        this(model,engine,weight);
        this.color = color;
    }

    public void printCarsInfo() {

        String displacement = null;
        String weight = null;

        if (this.engine.getDisplacement() == - 1) {
            displacement = "n/a";
        } else {
            displacement = String.valueOf(engine.getDisplacement());
        }

        DecimalFormat decimalFormat = new DecimalFormat("##.##");

        if (this.weight == - 1) {
            weight = "n/a";
        } else {
            weight = decimalFormat.format(this.weight);
        }

        System.out.printf("%s:%n",model);
        System.out.printf("%s:%n",engine.getModel());
        System.out.printf("Power: %s%n",this.engine.getPower());
        System.out.printf("Displacement: %s%n",displacement);
        System.out.printf("Efficiency: %s%n",this.engine.getEfficiency());
        System.out.printf("Weight: %s%n",weight);
        System.out.printf("Color: %s%n",this.color);

    }
}

