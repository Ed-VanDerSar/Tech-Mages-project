/**
 * The {@code Hero} class represents a hero character in the game, which is a 
 * specialized type of {@code Character}. The hero has a default weapon and a 
 * custom health bar color.
 */
public class Hero extends Character {

    /** The default weapon of the hero. */
    Weapon armaDefault;

    /**
     * Constructs a {@code Hero} with the specified name and health. 
     * The hero starts with the default weapon and a health bar colored green.
     * 
     * @param name the name of the hero
     * @param health the initial health of the hero
     */
    Hero(String name, int health) {
        super(name, health);
        this.armaDefault = weapon;
        super.healthBar = new HealthBar(this, "GREEN");
    }
}