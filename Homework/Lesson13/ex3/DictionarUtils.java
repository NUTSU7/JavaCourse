import java.util.HashMap;
import java.util.Map;

public class DictionarUtils {
    Map<String, String> dictionar = new HashMap<>();

    public DictionarUtils(Map<String, String> dictionar) {
        this.dictionar = dictionar;
    }

    public String getTraducere(String key) {
        return key+ " = " + dictionar.get(key);
    }
}
