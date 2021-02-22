package Shop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicExchangeTest {

    MusicExchange shop1;

    @Before
    public void before(){
        shop1 = new MusicExchange("Ray's Music Exchange");
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
}
