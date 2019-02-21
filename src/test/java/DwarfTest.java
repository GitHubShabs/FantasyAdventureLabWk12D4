import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;
    Weapon weapon;

    @Before
    public void before(){
        weapon = new Sword(10, "Stab");
        dwarf = new Dwarf("Boris", 50, weapon);
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
        assertEquals(weapon, dwarf.getWeapon());
    }

    @Test
    public void canChangeWeapon() {
        Weapon weapon = new Axe(15, "slash");
        dwarf.setWeapon(weapon);
        assertEquals(weapon, dwarf.getWeapon());
    }
    @Test
    public void canInflictDamage(){
        assertEquals(10, dwarf.attack());
    }

}
