package InterfacesAndAbstraction.MilitaryElite;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class CommandoImpl extends SpecialisedSoldierImpl implements Commando {

    private Set<Mission> missions;

    public CommandoImpl(String id, String firstName, String lastName, double salary, String corp) {
        super(id, firstName, lastName, salary, corp);
        this.missions = new LinkedHashSet<>();
    }

    public void addMission(Mission mission) {
        missions.add(mission);
    }

    @Override
    public Set<Mission> getMissions() {
        return missions;
    }

    @Override
    public String toString() {

        String corpString;
        if (getCorp().toString().equals("AIRFORCES")) {
            corpString = "Airforces";
        } else {
            corpString = "Marines";
        }

        return String.format("Name: %s %s Id: %s Salary: %.2f\nCorps: %s",getFirstName(),getLastName(),getId() ,getSalary(),corpString);
    }
}
