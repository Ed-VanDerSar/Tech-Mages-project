/**
 * The {@code HealthBar} class represents a visual representation of a character's health 
 * in the game. It displays the health using a bar made up of symbols and colors, updating 
 * dynamically as the character's health changes.
 */
public class HealthBar {

    
    Character character;
    int tamaño = 20;
    int valorMax;
    int valorActual;
    boolean tieneColor = true;
    String simboloRestante = "█";
    String simboloPerdido = "_";
    String barra = "|";

    /** A static instance of the {@code Colors} class to manage the color codes. */
    static Colors colores = new Colors();

    /** The color used to display the health bar. */
    String color = colores.valores.get("DEFAULT");

    /**
     * Constructs a {@code HealthBar} for the specified character and sets its color.
     * The health bar reflects the character's current and maximum health.
     * 
     * @param character the character whose health bar is displayed
     * @param color     the color used for the health bar, chosen from predefined color codes
     */
    HealthBar(Character character, String color) {
        this.character = character;
        this.color = colores.valores.get(color.toUpperCase());
        this.valorMax = character.maxHealth;
        this.valorActual = character.health;
    }

    /**
     * Updates the health bar to reflect the character's current health value.
     */
    void update() {
        this.valorActual = this.character.health;
    }

    /**
     * Paints the health bar by printing it to the console, showing the current health 
     * as a portion of the total health. The bar is displayed with the appropriate color 
     * and symbols to indicate remaining and lost health.
     */
    void paint() {
        int barrasRestantes = Math.round((float) valorActual / valorMax * tamaño);
        int barrasPerdidas = this.tamaño - barrasRestantes;
        System.out.println(this.character.name + " HEALTH: " + this.character.health);
        System.out.println(
            this.barra +
            this.color +
            (simboloRestante.repeat(barrasRestantes)) +
            (simboloPerdido.repeat(barrasPerdidas)) +
            this.color +
            this.barra
        );
    }
}