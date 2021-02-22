package Instruments;

import Behaviours.IPlay;

public class Piano extends Instrument implements IPlay {

    private int keyNumber;

    public Piano(String name, String brand, String  model, InstrumentType type, String colour, String material, String sound, int keyNumber, double salePrice, double costPrice) {
        super(name, brand, model, type, colour, material, sound, salePrice, costPrice);
        this.keyNumber = keyNumber;
    }

    public int getKeyNumber() {
        return keyNumber;
    }

    public void setKeyNumber(int keyNumber) {
        this.keyNumber = keyNumber;
    }

    public String playInstrument(){
        return "Pianos go " + this.getSound();
    }
}