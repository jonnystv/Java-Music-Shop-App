package Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet1;

    @Before
    public void before(){
        trumpet1 = new Trumpet("Trumpet One", "Yamaha", "YTR-2330", InstrumentType.BRASS, "gold", "brass", "baamp!", 3, 0, 0 );
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

    @Test
    public void canGetModel(){
        assertEquals("YTR-2330", trumpet1.getModel());
    }

    @Test
    public void canSetModel(){
        trumpet1.setModel("YTR-2330S");
        assertEquals("YTR-2330S", trumpet1.getModel());
    }

    @Test
    public void canGetInstrumentType(){
        assertEquals(InstrumentType.BRASS, trumpet1.getType());
    }

    @Test
    public void canSetInstrumentType(){
        trumpet1.setType(InstrumentType.WOODWIND);
        assertEquals(InstrumentType.WOODWIND, trumpet1.getType());
    }

    @Test
    public void canGetColour(){
        assertEquals("gold", trumpet1.getColour());
    }

    @Test
    public void canSetColour(){
        trumpet1.setColour("silver");
        assertEquals("silver", trumpet1.getColour());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("brass", trumpet1.getMaterial());
    }

    @Test
    public void canSetMaterial(){
        trumpet1.setMaterial("steel");
        assertEquals("steel", trumpet1.getMaterial());
    }

    @Test
    public void canGetSound(){
        assertEquals("baamp!", trumpet1.getSound());
    }

    @Test
    public void canSetSound(){
        trumpet1.setSound("boomp baamp!");
        assertEquals("boomp baamp!", trumpet1.getSound());
    }

    @Test
    public void canGetValveNumber(){
        assertEquals(3, trumpet1.getValveNumber());
    }

    @Test
    public void canSetValveNumber(){
        trumpet1.setValveNumber(4);
        assertEquals(4, trumpet1.getValveNumber());
    }

    @Test
    public void canGetSalePrice(){
        assertEquals(0, trumpet1.getSalePrice(), 0.01);
    }

    @Test
    public void canSetSalePrice(){
        trumpet1.setSalePrice(380.00);
        assertEquals(380.00, trumpet1.getSalePrice(), 0.01);
    }

    @Test
    public void canGetCostPrice(){
        assertEquals(0, trumpet1.getCostPrice(), 0.01);
    }

    @Test
    public void canSetCostPrice(){
        trumpet1.setCostPrice(250.00);
        assertEquals(250.00, trumpet1.getCostPrice(), 0.01);
    }

    @Test
    public void canPlayInstrument(){
        assertEquals("Trumpets go baamp!", trumpet1.playInstrument());
    }
}
