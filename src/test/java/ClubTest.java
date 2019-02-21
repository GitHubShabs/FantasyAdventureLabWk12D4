import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClubTest {

    Club club;

    @Before
    public void before(){
        club = new Club(20, "beat");
    }

    @Test
    public void hasDamageRating(){
        assertEquals(20, club.getDamage());
    }

    @Test
    public void hasWeaponAction(){
        assertEquals("beat", club.getClubAction());
    }
}
