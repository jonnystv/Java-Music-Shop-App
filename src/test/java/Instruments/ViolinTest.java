package Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {

    Violin violin1;

    @Before
    public void before(){
        violin1 = new Violin("Violin One", "Hidersine", "Venezia", InstrumentType.STRINGED, "brown", "spruce", "mmmvvvhhh!", 4, 0, 0 );
    }

    @Test
    public void canGetName(){
        assertEquals("Violin One", violin1.getName());
    }

    @Test
    public void canSetName(){
        violin1.setName("Violin Two");
        assertEquals("Violin Two", violin1.getName());
    }

    @Test
    public void canGetBrand(){
        assertEquals("Hidersine", violin1.getBrand());
    }

    @Test
    public void canSetBrand(){
        violin1.setBrand("Cremona");
        assertEquals("Cremona", violin1.getBrand());
    }

    @Test
    public void canGetModel(){
        assertEquals("Venezia", violin1.getModel());
    }

    @Test
    public void canSetModel(){
        violin1.setModel("SV-500");
        assertEquals("SV-500", violin1.getModel());
    }

    @Test
    public void canGetInstrumentType(){
        assertEquals(InstrumentType.STRINGED, violin1.getType());
    }

    @Test
    public void canSetInstrumentType(){
        violin1.setType(InstrumentType.KEYBOARD);
        assertEquals(InstrumentType.KEYBOARD, violin1.getType());
    }

    @Test
    public void canGetColour(){
        assertEquals("brown", violin1.getColour());
    }

    @Test
    public void canSetColour(){
        violin1.setColour("black");
        assertEquals("black", violin1.getColour());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("spruce", violin1.getMaterial());
    }

    @Test
    public void canSetMaterial(){
        violin1.setMaterial("maple");
        assertEquals("maple", violin1.getMaterial());
    }

    @Test
    public void canGetSound(){
        assertEquals("mmmvvvhhh!", violin1.getSound());
    }

    @Test
    public void canSetSound(){
        violin1.setSound("hmmm mmmvvvhhh!");
        assertEquals("hmmm mmmvvvhhh!", violin1.getSound());
    }

    @Test
    public void canGetStringNumber(){
        assertEquals(4, violin1.getStringNumber());
    }

    @Test
    public void canSetStringNumber(){
        violin1.setStringNumber(6);
        assertEquals(6, violin1.getStringNumber());
    }

    @Test
    public void canGetSalePrice(){
        assertEquals(0, violin1.getSalePrice(), 0.01);
    }

    @Test
    public void canSetSalePrice(){
        violin1.setSalePrice(455.00);
        assertEquals(455.00, violin1.getSalePrice(), 0.01);
    }

    @Test
    public void canGetCostPrice(){
        assertEquals(0, violin1.getCostPrice(), 0.01);
    }

    @Test
    public void canSetCostPrice(){
        violin1.setCostPrice(350.00);
        assertEquals(350.00, violin1.getCostPrice(), 0.01);
    }

    @Test
    public void canPlayInstrument(){
        assertEquals("Violins go mmmvvvhhh!", violin1.playInstrument());
    }

    @Test
    public void canCalculateMarkup(){
        violin1.setSalePrice(455.00);
        violin1.setCostPrice(350.00);
        assertEquals(105.00, violin1.calculateMarkup(), 0.01);
    }
}
