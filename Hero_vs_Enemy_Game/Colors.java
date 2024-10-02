import java.util.HashMap;

/**
 * The {@code Colors} class provides ANSI escape codes for color formatting in the console.
 * It stores a mapping between color names and their corresponding ANSI codes.
 */
public class Colors {

    /** A {@code HashMap} that holds color names as keys and their ANSI escape codes as values. */
    HashMap<String, String> valores = new HashMap<>();

    /**
     * Constructs a {@code Colors} object and initializes the color mappings.
     */
    Colors() {
        addColores();
    }

    /**
     * Adds predefined color mappings to the {@code valores} map.
     * The available colors are:
     * 
     * "RED"        - ANSI code for red text
     * "GREEN"      - ANSI code for green text
     * "DEFAULT"    - ANSI code to reset the text to default color
     * 
     */
    void addColores() {
        valores.put("RED", "\033[91m");
        valores.put("GREEN", "\033[92m");
        valores.put("DEFAULT", "\033[0m");
    }
}