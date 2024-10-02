/**
 * The {@code Weapon} class represents a weapon in the game. 
 * Each weapon has a name, type, and base damage value.
 */
public class Weapon {

    String name;
    String type;
    int baseDamage;

    /**
     * Constructs a {@code Weapon} with the specified name, type, damage, and value.
     * 
     * @param name   the name of the weapon
     * @param type   the type of the weapon (e.g., close quarters or distance)
     * @param damage the damage points dealt by the weapon
     * @param value  the monetary value of the weapon
     */
    Weapon(String name, String type, int baseDamage) {
        this.name = name;
        this.type = type;
        this.baseDamage = baseDamage;
    }

    static Weapon sword = new Weapon("Iron Sword", "Close quarters", 10);
    static Weapon bow = new Weapon("Bow", "distance", 7);
    static Weapon fists = new Weapon("Fists", "Close quarters", 3);
    static Weapon mace = new Weapon("Bronze Mace", "Close quarters", 8);
}