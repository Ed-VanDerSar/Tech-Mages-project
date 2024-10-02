public class HealthBar {
    Character character;
    int tamaño = 20;
    int valorMax;
    int valorActual;
    boolean tieneColor = true;
    String simboloRestante = "█";
    String simboloPerdido = "_";
    String barra = "|";
    static Colors colores = new Colors();
    String color = colores.valores.get("DEFAULT");

    HealthBar(Character character, String color) {
        this.character = character;
        this.color = colores.valores.get(color.toUpperCase());
        this.valorMax = character.maxHealth;
        this.valorActual = character.health;
    }

    void update() {
        this.valorActual = this.character.health;
    }

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