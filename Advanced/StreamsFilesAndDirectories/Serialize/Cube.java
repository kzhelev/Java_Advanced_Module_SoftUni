package StreamsFilesAndDirectories.Serialize;

import java.io.Serializable;

public class Cube implements Serializable {
    public String color;
    public double width;
    public double height;
    public double depth;

    public Cube(String color, double width, double height,double depth){
        this.color = color;
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
}
