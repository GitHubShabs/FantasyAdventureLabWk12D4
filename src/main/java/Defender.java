public abstract class Defender extends Player {

    String weapons;
    IAttack attack;


    public Defender(String name, int healthPoints, String weapons) {
        super(name, healthPoints);
        this.weapons = weapons;
    }

    public String getWeapon() {
        return weapons;
    }

    public void setWeapon(String weapons) {
        this.weapons = weapons;
    }
}
