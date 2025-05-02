package homework20;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;

public class MeetingRoom {

    private List<Trainable> participants;

    public MeetingRoom(List<Trainable> participants) {
        this.participants = participants;
    }

    public void conductTraining() {
        for (Trainable person : participants) {
            person.attendTraining();
        }
    }

    public void filterByNameLength(int maxLength) {
        System.out.println("Участники с именем короче " + maxLength + ":");

        Predicate<Trainable> shortNameCheck = t -> {
            if (t instanceof Employee) {
                String name = ((Employee) t).getName();
                return name.length() < maxLength;
            }
            return false;
        };

        for (Trainable t : participants) {
            if (shortNameCheck.test(t)) {
                System.out.println(((Employee) t).getName());
            }
        }
    }

    public static List<String> empToUpper(List<Employee> employees) {
        Function<Employee, String> toUpper = up -> up.getName().toUpperCase();

        List<String> result = new ArrayList<>();

        for (Employee emp : employees) {
            String upperName = toUpper.apply(emp);
            result.add(upperName);
        }

        return result;
    }



}
