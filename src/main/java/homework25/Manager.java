package homework25;

public class Manager extends Employee implements Interviewable{
    public Manager(String name, boolean isPayedPerHour, int age) {
        super(name, age, isPayedPerHour);
    }

    @Override
    public void conductInterview() {
        System.out.println(getName() + " is conducting an interview.");
    }
}
