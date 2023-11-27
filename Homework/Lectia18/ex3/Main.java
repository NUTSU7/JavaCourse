import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(true, true, "Software", "Ion"));
        list.add(new Employee(true, false, "Software", "Vasile"));
        list.add(new Employee(false, true, "Marketing", "Ion"));

        List<Employee> list2 = new ArrayList<>();

        list2=list.stream()
            .filter(e -> (e.getDepartment()=="Software" && e.getTrainer() && e.getInterviewer()))
            .collect(Collectors.toList());
            
        System.out.println(list2);
    }
}
