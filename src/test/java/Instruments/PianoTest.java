package Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano1;

    @Before
    public void before(){
        piano1 = new Piano("Piano One", "Yamaha", "P116", InstrumentType.KEYBOARD, "dark-brown", "ebony", "Plink Plonk!", 88, 0, 0 );
    }

    @Test
    public void canGetName(){
        assertEquals("Piano One", piano1.getName());
    }

    @Test
    public void canSetName(){
        piano1.setName("Piano Two");
        assertEquals("Piano Two", piano1.getName());
    }

    @Test
    public void canGetBrand(){
        assertEquals("Yamaha", piano1.getBrand());
    }

    @Test
    public void canSetBrand(){
        piano1.setBrand("Steinway");
        assertEquals("Steinway", piano1.getBrand());
    }

    @Test
    public void canGetModel(){
        assertEquals("P116", piano1.getModel());
    }

    @Test
    public void canSetModel(){
        piano1.setModel("SV-500");
        assertEquals("SV-500", piano1.getModel());
    }

    @Test
    public void canGetInstrumentType(){
        assertEquals(InstrumentType.KEYBOARD, piano1.getType());
    }

    @Test
    public void canSetInstrumentType(){
        piano1.setType(InstrumentType.PERCUSSION);
        assertEquals(InstrumentType.PERCUSSION, piano1.getType());
    }

    @Test
    public void canGetColour(){
        assertEquals("dark-brown", piano1.getColour());
    }

    @Test
    public void canSetColour(){
        piano1.setColour("light-brown");
        assertEquals("light-brown", piano1.getColour());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("ebony", piano1.getMaterial());
    }

    @Test
    public void canSetMaterial(){
        piano1.setMaterial("ivory");
        assertEquals("ivory", piano1.getMaterial());
    }

    @Test
    public void canGetSound(){
        assertEquals("Plink Plonk!", piano1.getSound());
    }

    @Test
    public void canSetSound(){
        piano1.setSound("Plink Plonk Tink Tonk!");
        assertEquals("Plink Plonk Tink Tonk!", piano1.getSound());
    }

    @Test
    public void canGetKeyNumber(){
        assertEquals(88, piano1.getKeyNumber());
    }

    @Test
    public void canSetStringNumber(){
        piano1.setKeyNumber(90);
        assertEquals(90, piano1.getKeyNumber());
    }

    @Test
    public void canGetSalePrice(){
        assertEquals(0, piano1.getSalePrice(), 0.01);
    }

    @Test
    public void canSetSalePrice(){
        piano1.setSalePrice(7500.00);
        assertEquals(7500.00, piano1.getSalePrice(), 0.01);
    }

    @Test
    public void canGetCostPrice(){
        assertEquals(0, piano1.getCostPrice(), 0.01);
    }

    @Test
    public void canSetCostPrice(){
        piano1.setCostPrice(7000.00);
        assertEquals(7000.00, piano1.getCostPrice(), 0.01);
    }

    @Test
    public void canPlayInstrument(){
        assertEquals("Pianos go Plink Plonk!", piano1.playInstrument());
    }

    @Test
    public void canCalculateMarkup(){
        piano1.setSalePrice(7500.00);
        piano1.setCostPrice(7000.00);
        assertEquals(500.00, piano1.calculateMarkup(), 0.01);
    }
}
