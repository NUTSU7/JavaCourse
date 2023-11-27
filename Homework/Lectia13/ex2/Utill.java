import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Utill {
    public Set<String> getUniqueList(List<String> list) {
        Set<String> set = new HashSet<>();
        set.addAll(list);
        return set;
    }
}
