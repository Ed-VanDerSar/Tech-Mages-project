public class Character {
    String name;
    int health;
    int maxHealth;
    double honor;
    Weapon weapon;
    HealthBar healthBar;
    Character (String name, int health){
        this.name = name;
        this.health = health;
        this.maxHealth = health;
        this.weapon = Weapon.fists;
        healthBar = new HealthBar(this, "DEFAULT" );
    }

    void attack (Character target) {
        // Subtract the weapon's damage from the target's health.
        target.health -= this.weapon.damage;
        target.health = Math.max(target.health, 0);
        target.healthBar.update();
        // Print showing who attacked who and with what weapon and with what damage

        System.out.println(this.name +
        " did " +
        this.weapon.damage +
        " damage points to " +
        target.name + 
        " with " +
         this.weapon.name);
    }

    void equip(Weapon weapon) {
        this.weapon = weapon;
        System.out.println(this.name + " equipped " + this.weapon.name);
    }

    void drop() {
        if (this.weapon.equals(Weapon.fists)) {
            System.out.println("You can not drop you're fists!");
        } else {
            System.out.println(this.name + " dropped " + this.weapon.name);
            this.weapon = Weapon.fists;
        }
    }

}