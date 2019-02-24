package Attack;

import Attack.Weapon;

public class Club extends Weapon {

    String action;

    public Club(int damage, String action) {
        super(damage);
        this.action = "beat";
    }

    public String getClubAction() {
        return action;
    }
}
