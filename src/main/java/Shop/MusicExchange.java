package Shop;

import Behaviours.ISell;

import java.util.ArrayList;

public class MusicExchange {

    private String name;
    private ArrayList<ISell> shopStock;

    public MusicExchange(String name) {
        this.name = name;
        this.shopStock = new ArrayList<ISell>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<ISell> getShopStock() {
        return shopStock;
    }
}
