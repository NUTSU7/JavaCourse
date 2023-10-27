package Utils;

public class Programmer extends Employee implements Training{
    
    public Programmer() {
        super();
    }
    
    public Programmer(int age, int yearsOfExp, String name) {
        super();
        this.age = age;
        this.yearsOfExp = yearsOfExp;
        this.name = name;
    }


    public void attendTraining() {
        trainingsMade++;
    }

}
