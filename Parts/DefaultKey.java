package Garage.Parts;

public class DefaultKey implements IKey{
    private String openKey;

    public DefaultKey(String  openKey) {
        this.openKey = openKey;
    }

    @Override
    public String getOpenKey() {
        return this.openKey;
    }
}