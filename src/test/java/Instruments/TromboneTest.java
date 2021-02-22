package Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TromboneTest {

    Trombone Trombone1;

    @Before
    public void before(){
        Trombone1 = new Trombone("Trombone One", "Yamaha", "YSL-354V", InstrumentType.BRASS, "gold", "brass", "boomb!", 3, 0, 0 );
    }

    @Test
    public void canGetName(){
        assertEquals("Trombone One", Trombone1.getName());
    }

    @Test
    public void canSetName(){
        Trombone1.setName("Trombone Two");
        assertEquals("Trombone Two", Trombone1.getName());
    }

    @Test
    public void canGetBrand(){
        assertEquals("Yamaha", Trombone1.getBrand());
    }

    @Test
    public void canSetBrand(){
        Trombone1.setBrand("Bach");
        assertEquals("Bach", Trombone1.getBrand());
    }

    @Test
    public void canGetModel(){
        assertEquals("YSL-354V", Trombone1.getModel());
    }

    @Test
    public void canSetModel(){
        Trombone1.setModel("YSL-354VC");
        assertEquals("YSL-354VC", Trombone1.getModel());
    }

    @Test
    public void canGetInstrumentType(){
        assertEquals(InstrumentType.BRASS, Trombone1.getType());
    }

    @Test
    public void canSetInstrumentType(){
        Trombone1.setType(InstrumentType.WOODWIND);
        assertEquals(InstrumentType.WOODWIND, Trombone1.getType());
    }

    @Test
    public void canGetColour(){
        assertEquals("gold", Trombone1.getColour());
    }

    @Test
    public void canSetColour(){
        Trombone1.setColour("silver");
        assertEquals("silver", Trombone1.getColour());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("brass", Trombone1.getMaterial());
    }

    @Test
    public void canSetMaterial(){
        Trombone1.setMaterial("aluminium");
        assertEquals("aluminium", Trombone1.getMaterial());
    }

    @Test
    public void canGetSound(){
        assertEquals("boomb!", Trombone1.getSound());
    }

    @Test
    public void canSetSound(){
        Trombone1.setSound("boomb buumb!");
        assertEquals("boomb buumb!", Trombone1.getSound());
    }

    @Test
    public void canGetValveNumber(){
        assertEquals(3, Trombone1.getValveNumber());
    }

    @Test
    public void canSetValveNumber(){
        Trombone1.setValveNumber(4);
        assertEquals(4, Trombone1.getValveNumber());
    }

    @Test
    public void canGetSalePrice(){
        assertEquals(0, Trombone1.getSalePrice(), 0.01);
    }

    @Test
    public void canSetSalePrice(){
        Trombone1.setSalePrice(1400.00);
        assertEquals(1400.00, Trombone1.getSalePrice(), 0.01);
    }

    @Test
    public void canGetCostPrice(){
        assertEquals(0, Trombone1.getCostPrice(), 0.01);
    }

    @Test
    public void canSetCostPrice(){
        Trombone1.setCostPrice(1100.00);
        assertEquals(1100.00, Trombone1.getCostPrice(), 0.01);
    }

    @Test
    public void canPlayInstrument(){
        assertEquals("Trombones go boomb!", Trombone1.playInstrument());
    }

    @Test
    public void canCalculateMarkup(){
        Trombone1.setSalePrice(1400.00);
        Trombone1.setCostPrice(1100.00);
        assertEquals(300.00, Trombone1.calculateMarkup(), 0.01);
    }
}
