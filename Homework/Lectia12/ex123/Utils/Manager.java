package Utils;

public class Manager extends Employee implements Interview,Training{
    int interviewsMade;

    public Manager() {
        super();
    }

    public Manager(int age, int yearsOfExp, String name) {
        this.age = age;
        this.yearsOfExp = yearsOfExp;
        this.name = name;
    }

    public int getInterviewsMade()
    {
        return interviewsMade;
    }
    
    public void conductInterview() {
        interviewsMade++;
    }

    public void attendTraining() {
        trainingsMade++;
    }


}
