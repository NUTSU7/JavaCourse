public class Employee {
    int age;
    boolean isPaidPerHour;
    String department;


    public Employee(int age, boolean isPaidPerHour, String department) {
        this.age = age;
        this.isPaidPerHour = isPaidPerHour;
        this.department = department;
    }


    @Override
    public String toString() {
        return age+" "+department+" "+isPaidPerHour;
    }

}
