import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;
    @Before
    public void before(){
        dwarf = new Dwarf("Boris", 50, "sword");
    }

    @Test
    public void hasName(){
        assertEquals("Boris", dwarf.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(50, dwarf.getHealthPoints());
    }

    @Test
    public void hasWeapon(){
        assertEquals("sword", dwarf.getWeapon());
    }

    @Test
    public void canChangeWeapon() {
        dwarf.setWeapon("axe");
        assertEquals("axe", dwarf.getWeapon());
    }
}
