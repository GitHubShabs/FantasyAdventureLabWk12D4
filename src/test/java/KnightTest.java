import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    @Before
    public void before(){
        knight = new Knight("Steve", 50, "sword");
    }

    @Test
    public void hasName(){
        assertEquals("Steve", knight.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(50, knight.getHealthPoints());
    }

    @Test
    public void hasWeapon(){
        assertEquals("sword", knight.getWeapon());
    }

    @Test
    public void canChangeWeapon() {
        knight.setWeapon("club");
        assertEquals("club", knight.getWeapon());
    }
}

