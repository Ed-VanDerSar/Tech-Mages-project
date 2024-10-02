import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Hero hero = new Hero( "Hero", 100);
        Enemy enemy = new Enemy("Enemy", 100, Weapon.bow);
        Scanner scan = new Scanner (System.in);
        hero.equip(Weapon.sword);
        enemy.equip(Weapon.bow);

        int numRounds = 10;
        int j = 0;
        while (j < numRounds) {
            cleanTerminal();
            System.out.println("ROUND " + (j + 1)); 
            hero.attack(enemy);
            enemy.attack(hero);
            hero.healthBar.paint();
            enemy.healthBar.paint();
            j++;
            scan.nextLine();
            scan.reset();
        }
        scan.close();
    }
    public static final void cleanTerminal() {
        System.out.println("\033c");    // Código ANSI
    }
}