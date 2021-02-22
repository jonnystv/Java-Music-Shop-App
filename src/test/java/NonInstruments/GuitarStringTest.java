package NonInstruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringTest {

    GuitarString stringSet1;

    @Before
    public void before(){
        stringSet1 = new GuitarString("Fender Regular 10-46", "Guitar Strings", NonInstrumentType.SPARE_PART, 0, 0, "nickel");
    }

    @Test
    public void canGetName() {
        assertEquals("Fender Regular 10-46", stringSet1.getName());
    }

    @Test
    public void canSetName() {
        stringSet1.setName("Martin M140");
        assertEquals("Martin M140", stringSet1.getName());
    }

    @Test
    public void canGetDescription() {
        assertEquals("Guitar Strings", stringSet1.getDescription());
    }

    @Test
    public void canSetDescription() {
        stringSet1.setDescription("Guitar Picks");
        assertEquals("Guitar Picks", stringSet1.getDescription());
    }

    @Test
    public void canGetNonInstrumentType() {
        assertEquals(NonInstrumentType.SPARE_PART, stringSet1.getType());
    }

    @Test
    public void canSetNonInstrumentType(){
        stringSet1.setType(NonInstrumentType.ACCESSORY);
        assertEquals(NonInstrumentType.ACCESSORY, stringSet1.getType());
    }

    @Test
    public void canGetSalePrice(){
        assertEquals(0, stringSet1.getSalePrice(), 0.01);
    }

    @Test
    public void canSetSalePrice(){
        stringSet1.setSalePrice(6.00);
        assertEquals(6.00, stringSet1.getSalePrice(), 0.01);
    }

    @Test
    public void canGetCostPrice(){
        assertEquals(0, stringSet1.getCostPrice(), 0.01);
    }

    @Test
    public void canSetCostPrice(){
        stringSet1.setCostPrice(5.00);
        assertEquals(5.00, stringSet1.getCostPrice(), 0.01);
    }

    @Test
    public void canGetWattRating(){
        assertEquals("nickel", stringSet1.getStringMaterial());
    }

    @Test
    public void canSetWattRating(){
        stringSet1.setStringMaterial("bronze");
        assertEquals("bronze", stringSet1.getStringMaterial());
    }

    @Test
    public void canCalculateMarkup(){
        stringSet1.setSalePrice(6.00);
        stringSet1.setCostPrice(5.00);
        assertEquals(1.00, stringSet1.calculateMarkup(), 0.01);
    }
}
