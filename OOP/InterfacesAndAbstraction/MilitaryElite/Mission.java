package InterfacesAndAbstraction.MilitaryElite;

public class Mission {

    private String codeName;
    private State state;

    public Mission(String codeName, String state) {
        this.codeName = codeName;
        setState(state);
    }

    public void setState(String state) {
        if (!State.valueOf(state.toUpperCase()).equals(State.INPROGRESS) && !State.valueOf(state.toUpperCase()).equals(State.FINISHED)) {
            throw new IllegalArgumentException("There is no such mission state as "+state);
        }
        this.state = State.valueOf(state.toUpperCase());
    }

    public void completeMission() {
        state = State.FINISHED;
    }

    @Override
    public String toString() {
        String stateString;
        if (state.toString().equals("INPROGRESS")) {
            stateString = "inProgress";
        } else {
            stateString = "finished";
        }
        return String.format("  Code Name: %s State: %s",codeName,stateString);
    }
}
