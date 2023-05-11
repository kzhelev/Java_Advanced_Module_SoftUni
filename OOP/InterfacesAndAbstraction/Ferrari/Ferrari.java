package InterfacesAndAbstraction.Ferrari;

public class Ferrari implements Car {

    private static final String MODEL = "488-Spider";
    private String driver;

    public Ferrari(String driver) {
        this.driver = driver;
    }

    @Override
    public String brakes() {
        return "Brakes!";
    }

    @Override
    public String gas() {
        return "brum-brum-brum-brrrrr";
    }

    @Override
    public String toString() {
        return String.format("%s/%s/%s/%s",MODEL,brakes(),gas(),driver);
    }
}
