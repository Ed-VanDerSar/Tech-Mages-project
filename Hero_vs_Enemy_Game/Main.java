import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero("Hero", 100);
        Enemy enemy = new Enemy("Enemy", 100);
        Scanner scan = new Scanner(System.in);

        // Display available weapons
        System.out.println("Choose a weapon for the hero:");
        System.out.println("1: Sword");
        System.out.println("2: Bow");
        System.out.println("3: Fists");
        System.out.println("4: Mace");

        // Get hero weapon choice
        int heroWeaponChoice = scan.nextInt();
        Weapon heroWeapon;
    
        // Equip the chosen weapon for the hero
        switch (heroWeaponChoice) {
            case 1:
                heroWeapon = Weapon.sword;
                break;
            case 2:
                heroWeapon = Weapon.bow;
                break;
            case 3:
                heroWeapon = Weapon.fists;
                break;
            case 4:
                heroWeapon = Weapon.mace;
                break;
            default:
                System.out.println("Invalid choice, equipping default weapon (Sword).");
                heroWeapon = Weapon.sword; // Default weapon
                break;
        }
        System.out.println(hero.name + " has equipped a " + hero.weapon.name);

        scan.nextLine();

        System.out.println("Choose a weapon for the enemy:");
        System.out.println("1: Sword");
        System.out.println("2: Bow");
        System.out.println("3: Fists");
        System.out.println("4: Mace");

        // Get enemy weapon choice
        int enemyWeaponChoice = scan.nextInt();
        Weapon enemyWeapon;

        // Equip the chosen weapon for the enemy
        switch (enemyWeaponChoice) {
            case 1:
                enemyWeapon = Weapon.sword;
                break;
            case 2:
                enemyWeapon = Weapon.bow;
                break;
            case 3:
                enemyWeapon = Weapon.fists;
                break;
            case 4:
                enemyWeapon = Weapon.mace;
                break;
            default:
                System.out.println("Invalid choice, equipping default weapon (Bow).");
                enemyWeapon = Weapon.bow; // Default weapon
                break;
        }
        System.out.println(enemy.name + " has equipped a " + enemy.weapon.name);
         // Equip initial weapons for the hero and enemy
         hero.equip(heroWeapon);
         enemy.equip(heroWeapon);

        
        // Consume any leftover newline after weapon selection
        scan.nextLine();
        
        
       
         // Start the battle or other game logic
        int numRounds = 10;
        int j = 0;
        
        // Loop through the specified number of rounds
        while (j < numRounds) {
            
            System.out.println("ROUND " + (j + 1)); 
            
            // Hero attacks enemy and enemy attacks hero
            hero.attack(enemy);
            enemy.attack(hero);
            
            // Display updated health bars
            hero.healthBar.paint();
            enemy.healthBar.paint();
            
            j++;
            
            // Wait for user input before proceeding to the next round
            scan.nextLine();
            scan.reset();
            cleanTerminal();  // Clear the terminal between rounds
        }
        
        // Close the scanner resource
        scan.close();
    }
    
    /**
     * Clears the terminal screen by printing an ANSI escape sequence. This method helps
     * refresh the console output between each round of the game.
     */
    public static final void cleanTerminal() {
        System.out.println("\033c");
    }
}