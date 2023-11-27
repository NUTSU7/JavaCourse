public class Employee {

    boolean trainer, interviewer;
    String department, nume;


    public Employee(boolean trainer, boolean interviewer, String department, String nume) {
        this.trainer = trainer;
        this.interviewer = interviewer;
        this.department = department;
        this.nume = nume;
    }


    @Override
    public String toString() {
        return "{" +
            " trainer='" + isTrainer() + "'" +
            ", interviewer='" + isInterviewer() + "'" +
            ", department='" + getDepartment() + "'" +
            ", nume='" + getNume() + "'" +
            "}";
    }


    public boolean isTrainer() {
        return this.trainer;
    }

    public boolean getTrainer() {
        return this.trainer;
    }

    public void setTrainer(boolean trainer) {
        this.trainer = trainer;
    }

    public boolean isInterviewer() {
        return this.interviewer;
    }

    public boolean getInterviewer() {
        return this.interviewer;
    }

    public void setInterviewer(boolean interviewer) {
        this.interviewer = interviewer;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getNume() {
        return this.nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
    

}
