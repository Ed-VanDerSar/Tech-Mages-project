public class Weapon {
    String name;
    String type;
    int damage;
    int value;

    Weapon(String name, String type, int damage, int value) {
        this.name = name;
        this.type = type;
        this.damage = damage;
        this.value = value;
    }

    static Weapon sword = new Weapon("Iron Sword", "Close quarters", 10,10);
    static Weapon bow = new Weapon("Bow", "distance", 7,5);
    static Weapon fists = new Weapon("Fists", "Close quarters", 3,0);
    static Weapon mace = new Weapon("Bronze Mace", "Close quarters", 8,10);
}