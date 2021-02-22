package Shop;

import Behaviours.ISell;
import Instruments.Guitar;
import Instruments.InstrumentType;
import Instruments.Piano;
import Instruments.Trumpet;
import NonInstruments.GuitarAmp;
import NonInstruments.NonInstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicExchangeTest {

    MusicExchange shop1;
    ISell guitar1;
    ISell piano1;
    ISell trumpet1;
    ISell amp1;

    @Before
    public void before(){
        shop1 = new MusicExchange("Ray's Music Exchange");
        guitar1 = new Guitar("Guitar One", "Fender", "Telecaster", InstrumentType.STRINGED, "burgundy", "alder", "strummm!", 6, 999.00, 800.00);
        piano1 = new Piano("Piano One", "Yamaha", "P116", InstrumentType.KEYBOARD, "dark-brown", "ebony", "Plink Plonk!", 88, 7500.00, 7000.00 );
        trumpet1 = new Trumpet("Trumpet One", "Yamaha", "YTR-2330", InstrumentType.BRASS, "gold", "brass", "baamp!", 3, 380.00, 250.00);
        amp1 = new GuitarAmp("Marshall JVM215C", "Guitar Amp", NonInstrumentType.ACCESSORY, 1200.00, 1000.00, 50);
    }

    @Test
    public void canGetName(){
        assertEquals("Ray's Music Exchange", shop1.getName());
    }

    @Test
    public void canSetName(){
        shop1.setName("Jonny's Music Exchange");
        assertEquals("Jonny's Music Exchange", shop1.getName());
    }

    @Test
    public void canAddToShopStock(){
        shop1.addToShopStock(guitar1);
        assertEquals(1, shop1.shopStockCount());
    }
}
