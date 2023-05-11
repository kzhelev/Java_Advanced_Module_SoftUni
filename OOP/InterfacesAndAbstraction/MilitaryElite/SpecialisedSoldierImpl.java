package InterfacesAndAbstraction.MilitaryElite;

public class SpecialisedSoldierImpl extends PrivateImpl implements SpecialisedSoldier {

    private Corp corp;

    public SpecialisedSoldierImpl(String id, String firstName, String lastName, double salary, String corp) {
        super(id, firstName, lastName, salary);
        setCorp(corp);
    }

    public void setCorp(String corp) {
        if (!Corp.valueOf(corp.toUpperCase()).equals(Corp.AIRFORCES) && !Corp.valueOf(corp.toUpperCase()).equals(Corp.MARINES)) {
            throw new IllegalArgumentException("There is no such corp as "+corp);
        }
        this.corp = Corp.valueOf(corp.toUpperCase());
    }

    @Override
    public Corp getCorp() {
        return corp;
    }
}
