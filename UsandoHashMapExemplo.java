import java.util.HashMap;
import java.util.Map;

public class UsandoHashMapExemplo {
    public static void main(String[] args) {
        Map<String, Integer> usandoHashMap = new HashMap<>();

        usandoHashMap.put("Gatos", 1);
        usandoHashMap.put("Cachorros", 2);
        usandoHashMap.put("Roedores", 3);

        int valor = usandoHashMap.get("Cachorros");
        System.out.println("Valor da chave Cachorros: " + valor);




    }
        }
