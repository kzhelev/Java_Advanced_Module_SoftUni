package InterfacesAndAbstraction.MilitaryElite;

public class SpyImpl extends SoldierImpl implements Spy {

    private String codeNumber;

    public SpyImpl(String id, String firstName, String lastName, String codeNumber) {
        super(id, firstName, lastName);
        this.codeNumber = codeNumber;
    }

    @Override
    public String getCodeName() {
        return codeNumber;
    }

    @Override
    public String toString() {
        return String.format("Name: %s %s Id: %s\nCode Number: %s",getFirstName(),getLastName(),getId(),getCodeName());
    }
}
