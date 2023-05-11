package Abstraction.TrafficLights;

public enum Signal {
    RED,
    GREEN,
    YELLOW;


    public static Signal parse(String string) {
        return Signal.valueOf(string);
    }

    public static Signal nextSignal(Signal signal) {
        switch (signal){
            case RED:
                return GREEN;
            case GREEN:
                return YELLOW;
            case YELLOW:
                return RED;
            default:
                throw new IllegalArgumentException("Wrong command "+signal);
        }
    }
}
