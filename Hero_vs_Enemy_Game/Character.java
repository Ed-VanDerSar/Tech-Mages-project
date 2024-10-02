/**
 * The {@code Character} class represents a character in a game, with a name, health, 
 * a weapon, and a health bar. A character can attack another character and equip or 
 * drop weapons.
 */
public class Character {

    String name;
    int health;
    int maxHealth;
    double honor;
    Weapon weapon;
    HealthBar healthBar;

    /**
     * Constructs a {@code Character} with the specified name and health. 
     * The character starts with the maximum health equal to the initial health, 
     * and is equipped with the default weapon (fists).
     * 
     * @param name the name of the character
     * @param health the initial health of the character
     */
    Character(String name, int health) {
        this.name = name;
        this.health = health;
        this.maxHealth = health;
        this.weapon = Weapon.fists;
        healthBar = new HealthBar(this, "DEFAULT");
    }

    /**
     * Attacks the target character by subtracting the weapon's damage from 
     * the target's health. The health of the target cannot go below zero.
     * The target's health bar is updated accordingly.
     * 
     * @param target the character being attacked
     */
    void attack(Character target) {
        // Subtract the weapon's damage from the target's health
        target.health -= this.weapon.damage;
        target.health = Math.max(target.health, 0);
        target.healthBar.update();
        
        // Print attack details
        System.out.println(this.name + 
                           " did " + 
                           this.weapon.damage + 
                           " damage points to " + 
                           target.name + 
                           " with " + 
                           this.weapon.name);
    }

    /**
     * Equips the specified weapon for the character, replacing the current weapon.
     * 
     * @param weapon the weapon to equip
     */
    void equip(Weapon weapon) {
        this.weapon = weapon;
        System.out.println(this.name + " equipped " + this.weapon.name);
    }

    /**
     * Drops the currently equipped weapon. If the character is equipped with fists, 
     * which is the default weapon, the weapon cannot be dropped.
     */
    void drop() {
        if (this.weapon.equals(Weapon.fists)) {
            System.out.println("You cannot drop your fists!");
        } else {
            System.out.println(this.name + " dropped " + this.weapon.name);
            this.weapon = Weapon.fists;
        }
    }
}