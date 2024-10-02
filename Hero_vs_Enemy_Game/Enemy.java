public class Enemy extends Character {
    Enemy(String name, int health, Weapon weapon) {
        super(name, health);
        this.weapon = weapon;
        super.healthBar = new HealthBar(this, "RED");
    }
}