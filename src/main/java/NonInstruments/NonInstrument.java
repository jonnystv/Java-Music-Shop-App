package NonInstruments;

public abstract class NonInstrument {

    private String name;
    private String description;
    private NonInstrumentType type;
    private double salePrice;
    private double costPrice;

    public NonInstrument(String name, String description, NonInstrumentType type, double salePrice, double costPrice){
        this.name = name;
        this.description = description;
        this.type = type;
        this.salePrice = 0;
        this.costPrice = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public NonInstrumentType getType() {
        return type;
    }

    public void setType(NonInstrumentType type) {
        this.type = type;
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
