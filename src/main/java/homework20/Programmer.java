package homework20;

public class Programmer extends Employee implements Trainable {
    public Programmer (String name, int id) {
        super(name, id);
    }

    @Override
    public void attendTraining() {
        System.out.println(getName() + " (Programmer) is attending training.");
    }
}
