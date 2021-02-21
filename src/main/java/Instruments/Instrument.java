package Instruments;

import Instruments.InstrumentType;

public abstract class Instrument {

    private String name;
    private String brand;
    private String model;
    private InstrumentType type;
    private String colour;
    private String material;
    private String sound;
    private double salePrice;
    private double costPrice;

    public Instrument(String name, String brand, String  model, InstrumentType type, String colour, String material, String sound){
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.colour = colour;
        this.material = material;
        this.sound  = sound;
        this.salePrice = 0;
        this.costPrice = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public InstrumentType getType() {
        return type;
    }

    public void setType(InstrumentType type) {
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }
}
