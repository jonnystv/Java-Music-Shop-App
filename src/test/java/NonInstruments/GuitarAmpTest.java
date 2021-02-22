package NonInstruments;

import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarAmpTest {

    GuitarAmp amp1;

    @Before
    public void before(){
        amp1 = new GuitarAmp("Marshall JVM215C", "Guitar Amp", NonInstrumentType.ACCESSORY, 0, 0, 50);
    }

    @Test
    public void canGetName() {
        assertEquals("Marshall JVM215C", amp1.getName());
    }

    @Test
    public void canSetName() {
        amp1.setName("Fender 68");
        assertEquals("Fender 68", amp1.getName());
    }

    @Test
    public void canGetDescription() {
        assertEquals("Guitar Amp", amp1.getDescription());
    }

    @Test
    public void canSetDescription() {
        amp1.setDescription("Guitar Amplifier");
        assertEquals("Guitar Amplifier", amp1.getDescription());
    }

    @Test
    public void canGetNonInstrumentType() {
        assertEquals(NonInstrumentType.ACCESSORY, amp1.getType());
    }

    @Test
    public void canSetNonInstrumentType(){
        amp1.setType(NonInstrumentType.SPARE_PART);
        assertEquals(NonInstrumentType.SPARE_PART, amp1.getType());
    }

    @Test
    public void canGetSalePrice(){
        assertEquals(0, amp1.getSalePrice(), 0.01);
    }

    @Test
    public void canSetSalePrice(){
        amp1.setSalePrice(1200.00);
        assertEquals(1200.00, amp1.getSalePrice(), 0.01);
    }

    @Test
    public void canGetCostPrice(){
        assertEquals(0, amp1.getCostPrice(), 0.01);
    }

    @Test
    public void canSetCostPrice(){
        amp1.setCostPrice(1000.00);
        assertEquals(1000.00, amp1.getCostPrice(), 0.01);
    }

    @Test
    public void canGetWattRating(){
        assertEquals(50, amp1.getWattRating(), 0.01);
    }

    @Test
    public void canSetWattRating(){
        amp1.setWattRating(38);
        assertEquals(38, amp1.getWattRating(), 0.01);
    }
}
