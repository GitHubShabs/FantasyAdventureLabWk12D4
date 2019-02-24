import Attack.IWeapon;
import Attack.Weapon;

public abstract class Defender extends Player implements IWeapon {

    Weapon weapon;


    public Defender(String name, int healthPoints, Weapon weapon) {
        super(name, healthPoints);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public int attack() {
        return this.weapon.getDamage();
    }
}
