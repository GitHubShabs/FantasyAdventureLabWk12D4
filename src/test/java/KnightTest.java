import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Weapon weapon;

    @Before
    public void before(){
        weapon = new Sword(10, "stab");
        knight = new Knight("Steve", 50, weapon);
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
        assertEquals(weapon, knight.getWeapon());
    }

    @Test
    public void canChangeWeapon() {
        Weapon weapon = new Sword(10, "stab");
        knight.setWeapon(weapon);
        assertEquals(weapon, knight.getWeapon());
    }

    @Test
    public void canInflictDamage(){
        assertEquals(10, knight.attack());
    }
}

