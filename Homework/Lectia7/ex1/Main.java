public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Liviu", 16, "IT");
        System.out.println(employee.getAge());
        System.out.println(employee.getName());
        System.out.println(employee.getDepartment());
    }
}
