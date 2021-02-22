package NonInstruments;

public class GuitarString extends NonInstrument {

    private String stringMaterial;

    public GuitarString(String name, String description, NonInstrumentType type, double salePrice, double costPrice, String stringMaterial){
        super(name, description,type, salePrice, costPrice);
        this.stringMaterial = stringMaterial;
    }

    public String getStringMaterial() {
        return stringMaterial;
    }

    public void setStringMaterial(String stringMaterial) {
        this.stringMaterial = stringMaterial;
    }
}
