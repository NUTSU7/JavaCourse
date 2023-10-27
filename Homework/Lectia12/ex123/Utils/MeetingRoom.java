package Utils;

public class MeetingRoom {
    Training trainings[];

    public MeetingRoom() {

    }
    
    public MeetingRoom(Training[] trainings) {
        this.trainings = trainings;
    }

    public void multiAttend() {
        for (int i = 0; i < trainings.length; i++) {
            trainings[i].attendTraining();
        }
    }

}
