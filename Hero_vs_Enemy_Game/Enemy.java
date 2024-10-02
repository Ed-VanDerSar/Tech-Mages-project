/**
 * The {@code Enemy} class represents an enemy character in the game, which is a 
 * specialized type of {@code Character}. The enemy has a specified weapon and 
 * a custom health bar color.
 */
public class Enemy extends Character {

    /** The default weapon of the hero. */
    Weapon armaDefault;
    /**
     * Constructs an {@code Enemy} with the specified name, health, and weapon.
     * The enemy's health bar is displayed in red.
     * 
     * @param name   the name of the enemy
     * @param health the initial health of the enemy
     */
    Enemy(String name, int health) {
        super(name, health);
        this.armaDefault = weapon;
        super.healthBar = new HealthBar(this, "RED");
    }
}