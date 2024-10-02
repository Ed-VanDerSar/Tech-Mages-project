import java.util.HashMap;

public class Colors {
    HashMap <String, String> valores = new HashMap<>();

    Colors() {
        addColores();
    }

    void addColores() {
        valores.put("RED", "\033[91m");
        valores.put("GREEN", "\033[92m");
        valores.put("DEFAULT", "\033[0m");
    }
}