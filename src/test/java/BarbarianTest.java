import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    @Before
    public void before(){
        barbarian = new Barbarian("Doris", 50, "club");
    }

    @Test
    public void hasName(){
        assertEquals("Doris", barbarian.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(50, barbarian.getHealthPoints());
    }

    @Test
    public void hasWeapon(){
        assertEquals("club", barbarian.getWeapon());
    }

    @Test
    public void canChangeWeapon() {
        barbarian.setWeapon("sword");
        assertEquals("sword", barbarian.getWeapon());
    }
}

