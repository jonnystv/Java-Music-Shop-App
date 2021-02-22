package NonInstruments;

public class GuitarAmp extends NonInstrument {

    private int wattRating;

    public GuitarAmp(String name, String description, NonInstrumentType type, double salePrice, double costPrice, int wattRating){
        super(name, description, type, salePrice, costPrice);
        this.wattRating = wattRating;
    }

    public int getWattRating() {
        return wattRating;
    }

    public void setWattRating(int wattRating) {
        this.wattRating = wattRating;
    }
}
