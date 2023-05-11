package InterfacesAndAbstraction.MilitaryElite;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class EngineerImpl extends SpecialisedSoldierImpl implements Engineer {

    private Set<Repair> repairs;

    public EngineerImpl(String id, String firstName, String lastName, double salary, String corp) {
        super(id, firstName, lastName, salary, corp);
        this.repairs = new LinkedHashSet<>();
    }

    public void addRepair(Repair repair) {
        repairs.add(repair);
    }

    @Override
    public Set<Repair> getRepairs() {
        return repairs;
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
