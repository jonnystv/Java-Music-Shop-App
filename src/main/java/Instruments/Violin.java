package Instruments;

import Behaviours.IPlay;

public class Violin extends Instrument implements IPlay {

    private int stringNumber;

    public Violin(String name, String brand, String  model, InstrumentType type, String colour, String material, String sound, int stringNumber, double salePrice, double costPrice) {
        super(name, brand, model, type, colour, material, sound, salePrice, costPrice);
        this.stringNumber = stringNumber;
    }

    public int getStringNumber() {
        return stringNumber;
    }

    public void setStringNumber(int stringNumber) {
        this.stringNumber = stringNumber;
    }

    public String playInstrument(){
        return "Violins go " + this.getSound();
    }
}