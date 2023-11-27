import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Utill util = new Utill();

        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("d");

        System.out.println(util.getUniqueList(list));
        
    }
}
