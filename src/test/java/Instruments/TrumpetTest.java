package Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet1;

    @Before
    public void before(){
        trumpet1 = new Trumpet("Trumpet One", "Yamaha", "YTR-2330", InstrumentType.BRASS, "gold", "brass", "baamp!" );
    }

    @Test
    public void canGetName(){
        assertEquals("Trumpet One", trumpet1.getName());
    }

    @Test
    public void canSetName(){
        trumpet1.setName("Trumpet Two");
        assertEquals("Trumpet Two", trumpet1.getName());
    }

    @Test
    public void canGetBrand(){
        assertEquals("Yamaha", trumpet1.getBrand());
    }

    @Test
    public void canSetBrand(){
        trumpet1.setBrand("Bach");
        assertEquals("Bach", trumpet1.getBrand());
    }



}
