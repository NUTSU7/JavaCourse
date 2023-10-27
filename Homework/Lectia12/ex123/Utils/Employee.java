package Utils;

public class Employee {
    int age, yearsOfExp, trainingsMade;
    String name;

    public Employee() {
        
    }

    public Employee(int age, int yearsOfExp, String name) {
        this.age = age;
        this.yearsOfExp = yearsOfExp;
        this.name = name;
    }


    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearsOfExp() {
        return this.yearsOfExp;
    }

    public void setYearsOfExp(int yearsOfExp) {
        this.yearsOfExp = yearsOfExp;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTrainingsMade() {
        return this.trainingsMade;
    }


}
