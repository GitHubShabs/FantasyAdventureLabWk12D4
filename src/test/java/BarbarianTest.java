import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    Weapon weapon;

    @Before
    public void before(){
        weapon = new Club(20, "beat");
        barbarian = new Barbarian("Doris", 50, weapon);
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
        assertEquals(weapon, barbarian.getWeapon());
    }

    @Test
    public void canChangeWeapon() {
        Weapon weapon = new Sword(10, "stab");
        barbarian.setWeapon(weapon);
        assertEquals(weapon, barbarian.getWeapon());
    }

    @Test
    public void canInflictDamage(){
        assertEquals(20, barbarian.attack());
    }
}

