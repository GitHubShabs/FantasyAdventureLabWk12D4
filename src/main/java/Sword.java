public class Sword extends Weapon {

    String action;

    public Sword(int damage, String action) {
        super(damage);
        this.action = "stab";
    }

    public String getSwordAction() {
        return action;
    }
}
