package InterfacesAndAbstraction.MilitaryElite;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LieutenantGeneralImpl extends PrivateImpl implements LieutenantGeneral {

    private Set<Private> privates;

    public LieutenantGeneralImpl(String id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
        this.privates = new LinkedHashSet<>();
    }

    public void addPrivate(Private priv) {
        privates.add(priv);
    }

    @Override
    public Set<Private> getPrivates() {
        return privates;
    }

    @Override
    public String toString() {
        return String.format("Name: %s %s Id: %s Salary: %.2f",getFirstName(),getLastName(),getId() ,getSalary());
    }
}
