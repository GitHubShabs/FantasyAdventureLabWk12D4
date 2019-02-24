public abstract class Enemy {

    String name;
    int healthPoints;
    int damageValue;


    public Enemy(String name, int healthPoints){
        this.name = name;
        this.healthPoints = healthPoints;
        this.damageValue = damageValue;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getDamageValue() {
        return damageValue;
    }
}


