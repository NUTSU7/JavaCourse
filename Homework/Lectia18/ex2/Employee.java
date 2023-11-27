public class Employee {
    int age;
    boolean isPaidPerHour;
    String department, name;



    public Employee(int age, boolean isPaidPerHour, String department, String name) {
        this.age = age;
        this.isPaidPerHour = isPaidPerHour;
        this.department = department;
        this.name = name;
    }


    @Override
    public String toString() {
        return age+" "+department+" "+isPaidPerHour+" "+name;
    }

}
