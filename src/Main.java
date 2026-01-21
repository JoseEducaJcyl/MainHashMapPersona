import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Creamos un Map (String como nombre y int como edad) de personas
        Map<String,Integer> personas = new HashMap<>();
        //Añadimos elementos a personas
        personas.put("Alex",21);
        personas.put("Bob",22);
        personas.put("Carlos",25);

        //Imprimimos la edad de Alex
        System.out.println("Edad: " + personas.get("Alex"));
    }
}