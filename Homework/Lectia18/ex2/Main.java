import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(40, true, "IT", "Ion"));
        list.add(new Employee(35, false, "IT", "Vasile"));
        list.add(new Employee(30, false, "IT", "Dima"));

        List<String> list2 = new ArrayList<>();

        list2=list.stream()
            .filter(t -> (t.age > 30) && (t.isPaidPerHour == false))
            .map(t -> t.name)
            .sorted()
            .collect(Collectors.toList());
            
        System.out.println(list2);
    }
}
