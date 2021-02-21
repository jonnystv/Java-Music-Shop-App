package Instruments;

import Behaviours.IPlay;

public class Trumpet extends Instrument implements IPlay {

    private int valveNumber;

    public Trumpet(String name, String brand, String  model, InstrumentType type, String colour, String material, String sound, int valveNumber, double salePrice, double costPrice) {
        super(name, brand, model, type, colour, material, sound, salePrice, costPrice);
        this.valveNumber = valveNumber;
    }

    public int getValveNumber() {
        return valveNumber;
    }

    public void setValveNumber(int valveNumber) {
        this.valveNumber = valveNumber;
    }

    public String playInstrument(){
        return "Trumpets go " + this.getSound();
    }
}
