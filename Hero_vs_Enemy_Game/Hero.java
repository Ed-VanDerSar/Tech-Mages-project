public class Hero extends Character {
    Weapon armaDefault;

    Hero(String name, int health) {
        super(name, health);
        this.armaDefault = weapon;
        super.healthBar = new HealthBar(this, "GREEN");
    }
}