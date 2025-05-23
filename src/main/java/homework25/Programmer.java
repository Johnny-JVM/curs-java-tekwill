package homework25;

public class Programmer extends Employee implements Trainable, Interviewable{
    public Programmer(String name, int age, boolean isPayedPerHour) {
        super(name, age, isPayedPerHour);
    }

    @Override
    public void attendTrainning() {
        System.out.println(getName() + " is attending training.");
    }

    @Override
    public void conductInterview() {
        System.out.println(getName() + " is conducting interview.");
    }
}
