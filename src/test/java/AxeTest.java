import Attack.Axe;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AxeTest {

    Axe axe;

    @Before
    public void before(){
        axe = new Axe(15,"slash");
    }

    @Test
    public void hasDamageRating(){
        assertEquals(15, axe.getDamage());
    }

    @Test
    public void hasWeaponActiion(){
        assertEquals("slash", axe.getAxeAction());
    }
}
