import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(22, true, "IT"));
        list.add(new Employee(26, true, "Management"));
        list.add(new Employee(30, true, "Marketing"));

        list = list.stream()
            .limit(5)
            .filter(t -> (t.isPaidPerHour) && (t.department.equals("Management")) && t.age>=25)
            .collect(Collectors.toList());

        System.out.println(list);
    }
}
