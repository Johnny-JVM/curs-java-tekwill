package homework20;

public class Manager extends Employee implements Trainable, Interviewable {
    public Manager (String name, int id) {
        super(name, id);
    }

    @Override
    public void attendTraining() {
        System.out.println(getName() + " (Manager) is attending training.");
    }

    @Override
    public void conductInterview() {
        System.out.println(getName() + " is conducting an interview.")
        ;
    }
}
