import Utils.Employee;
import Utils.Manager;
import Utils.MeetingRoom;
import Utils.Programmer;
import Utils.Training;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager(25, 3, "Liviu");
        manager.attendTraining();
        System.out.println(manager.getTrainingsMade());


        Training trainings[] = new Training[3];
        trainings[0] = () -> System.out.println("Training1 attended training");
        trainings[1] = () -> System.out.println("Training2 attended training");
        trainings[2] = () -> System.out.println("Training3 attended training");
        MeetingRoom mr = new MeetingRoom(trainings);

        mr.multiAttend();
        
        Employee employees[] = {new Programmer(25, 2, "Liviu"),
                                new Manager(30, 10, "Danu"),
                new Programmer(18, 1, "Dima")};
        
        for (Employee e : employees) {
            if (e instanceof Manager) {
                ((Manager) e).conductInterview();
                ((Manager) e).attendTraining();
                System.out.println(((Manager) e).getInterviewsMade());
                System.out.println(((Manager) e).getTrainingsMade());
            } else {
                ((Programmer) e).attendTraining();
                System.out.println(((Programmer) e).getTrainingsMade());
            }
                
            System.out.println();

        }
    }


}
