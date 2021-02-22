package Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {

    Violin Violin1;

    @Before
    public void before(){
        Violin1 = new Violin("Violin One", "Hidersine", "Venezia", InstrumentType.STRINGED, "brown", "spruce", "mmmvvvhhh!", 4, 0, 0 );
    }

    @Test
    public void canGetName(){
        assertEquals("Violin One", Violin1.getName());
    }

    @Test
    public void canSetName(){
        Violin1.setName("Violin Two");
        assertEquals("Violin Two", Violin1.getName());
    }

    @Test
    public void canGetBrand(){
        assertEquals("Hidersine", Violin1.getBrand());
    }

    @Test
    public void canSetBrand(){
        Violin1.setBrand("Cremona");
        assertEquals("Cremona", Violin1.getBrand());
    }

    @Test
    public void canGetModel(){
        assertEquals("Venezia", Violin1.getModel());
    }

    @Test
    public void canSetModel(){
        Violin1.setModel("SV-500");
        assertEquals("SV-500", Violin1.getModel());
    }

    @Test
    public void canGetInstrumentType(){
        assertEquals(InstrumentType.STRINGED, Violin1.getType());
    }

    @Test
    public void canSetInstrumentType(){
        Violin1.setType(InstrumentType.KEYBOARD);
        assertEquals(InstrumentType.KEYBOARD, Violin1.getType());
    }

    @Test
    public void canGetColour(){
        assertEquals("brown", Violin1.getColour());
    }

    @Test
    public void canSetColour(){
        Violin1.setColour("black");
        assertEquals("black", Violin1.getColour());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("spruce", Violin1.getMaterial());
    }

    @Test
    public void canSetMaterial(){
        Violin1.setMaterial("maple");
        assertEquals("maple", Violin1.getMaterial());
    }

    @Test
    public void canGetSound(){
        assertEquals("mmmvvvhhh!", Violin1.getSound());
    }

    @Test
    public void canSetSound(){
        Violin1.setSound("hmmm mmmvvvhhh!");
        assertEquals("hmmm mmmvvvhhh!", Violin1.getSound());
    }

    @Test
    public void canGetStringNumber(){
        assertEquals(4, Violin1.getStringNumber());
    }

    @Test
    public void canSetStringNumber(){
        Violin1.setStringNumber(6);
        assertEquals(6, Violin1.getStringNumber());
    }

    @Test
    public void canGetSalePrice(){
        assertEquals(0, Violin1.getSalePrice(), 0.01);
    }

    @Test
    public void canSetSalePrice(){
        Violin1.setSalePrice(455.00);
        assertEquals(455.00, Violin1.getSalePrice(), 0.01);
    }

    @Test
    public void canGetCostPrice(){
        assertEquals(0, Violin1.getCostPrice(), 0.01);
    }

    @Test
    public void canSetCostPrice(){
        Violin1.setCostPrice(350.00);
        assertEquals(350.00, Violin1.getCostPrice(), 0.01);
    }

    @Test
    public void canPlayInstrument(){
        assertEquals("Violins go mmmvvvhhh!", Violin1.playInstrument());
    }
}
