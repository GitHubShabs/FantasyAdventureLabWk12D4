public class Axe extends Weapon {

   String action;

    public Axe(int damage, String action) {
        super(damage);
        this.action = "slash";
    }

    public String getAxeAction() {
        return action;
    }
}
