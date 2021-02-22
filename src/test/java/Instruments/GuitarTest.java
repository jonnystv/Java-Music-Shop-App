package Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar1;

    @Before
    public void before(){
        guitar1 = new Guitar("Guitar One", "Fender", "Telecaster", InstrumentType.STRINGED, "burgundy", "alder", "strummm!", 6, 0, 0 );
    }

    @Test
    public void canGetName(){
        assertEquals("Guitar One", guitar1.getName());
    }

    @Test
    public void canSetName(){
        guitar1.setName("Guitar Two");
        assertEquals("Guitar Two", guitar1.getName());
    }

    @Test
    public void canGetBrand(){
        assertEquals("Fender", guitar1.getBrand());
    }

    @Test
    public void canSetBrand(){
        guitar1.setBrand("Gibson");
        assertEquals("Gibson", guitar1.getBrand());
    }

    @Test
    public void canGetModel(){
        assertEquals("Telecaster", guitar1.getModel());
    }

    @Test
    public void canSetModel(){
        guitar1.setModel("Les Paul");
        assertEquals("Les Paul", guitar1.getModel());
    }

    @Test
    public void canGetInstrumentType(){
        assertEquals(InstrumentType.STRINGED, guitar1.getType());
    }

    @Test
    public void canSetInstrumentType(){
        guitar1.setType(InstrumentType.KEYBOARD);
        assertEquals(InstrumentType.KEYBOARD, guitar1.getType());
    }

    @Test
    public void canGetColour(){
        assertEquals("burgundy", guitar1.getColour());
    }

    @Test
    public void canSetColour(){
        guitar1.setColour("white");
        assertEquals("white", guitar1.getColour());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("alder", guitar1.getMaterial());
    }

    @Test
    public void canSetMaterial(){
        guitar1.setMaterial("mahogany");
        assertEquals("mahogany", guitar1.getMaterial());
    }

    @Test
    public void canGetSound(){
        assertEquals("strummm!", guitar1.getSound());
    }

    @Test
    public void canSetSound(){
        guitar1.setSound("strum strummm!");
        assertEquals("strum strummm!", guitar1.getSound());
    }

    @Test
    public void canGetStringNumber(){
        assertEquals(6, guitar1.getStringNumber());
    }

    @Test
    public void canSetStringNumber(){
        guitar1.setStringNumber(12);
        assertEquals(12, guitar1.getStringNumber());
    }

    @Test
    public void canGetSalePrice(){
        assertEquals(0, guitar1.getSalePrice(), 0.01);
    }

    @Test
    public void canSetSalePrice(){
        guitar1.setSalePrice(999.00);
        assertEquals(999.00, guitar1.getSalePrice(), 0.01);
    }

    @Test
    public void canGetCostPrice(){
        assertEquals(0, guitar1.getCostPrice(), 0.01);
    }

    @Test
    public void canSetCostPrice(){
        guitar1.setCostPrice(800.00);
        assertEquals(800.00, guitar1.getCostPrice(), 0.01);
    }

    @Test
    public void canPlayInstrument(){
        assertEquals("Guitars go strummm!", guitar1.playInstrument());
    }
}
