import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> dictionar1 = new HashMap<>();
        dictionar1.put("telefon", "phone");
        dictionar1.put("calculator", "computer");
        dictionar1.put("mana", "hand");
        dictionar1.put("casti", "headphones");
        dictionar1.put("baterie", "battery");
        dictionar1.put("ochi", "eyes");
        dictionar1.put("scaun", "chiar");
        dictionar1.put("carte", "book");
        dictionar1.put("scoala", "school");
        dictionar1.put("curs", "course");

        DictionarUtils dictionar = new DictionarUtils(dictionar1);

        System.out.println(dictionar.getTraducere("telefon"));
        System.out.println(dictionar.getTraducere("curs"));
        System.out.println(dictionar.getTraducere("scoala"));
        System.out.println(dictionar.getTraducere("calculator"));
        System.out.println(dictionar.getTraducere("mana"));
        

    }
}
