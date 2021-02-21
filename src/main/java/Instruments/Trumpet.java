package Instruments;

public class Trumpet extends Instrument {

    private int valveNumber;

    public Trumpet(String brand, String  model, String name, InstrumentType type, String colour, String material, String sound) {
        super(brand, model, name, type, colour, material, sound);
        this.valveNumber = valveNumber;
    }

    public int getValveNumber() {
        return valveNumber;
    }

    public void setValveNumber(int valveNumber) {
        this.valveNumber = valveNumber;
    }
}
