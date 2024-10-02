import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero("Hero", 100);
        Enemy enemy = new Enemy("Enemy", 100, Weapon.bow);
        Scanner scan = new Scanner(System.in);
        
        // Equip initial weapons for the hero and enemy
        hero.equip(Weapon.sword);
        enemy.equip(Weapon.bow);
    
        int numRounds = 10;
        int j = 0;
        
        // Loop through the specified number of rounds
        while (j < numRounds) {
            cleanTerminal();  // Clear the terminal between rounds
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