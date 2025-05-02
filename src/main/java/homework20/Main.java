package homework20;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Stas", 25);
        Manager manager = new Manager("Maks", 31);

        Programmer p1 = new Programmer("Alice", 101);
        Manager m1 = new Manager("Bob", 202);
        Programmer p2 = new Programmer("Charlie", 103);

        List <Trainable> participants = List.of(p1, p2, m1);

        programmer.attendTraining();
        manager.attendTraining();

        manager.conductInterview();

        Trainable[] attendees = { programmer, manager };
        for (Trainable t : attendees) {
            t.attendTraining();
        }

        Employee[] employees = { programmer, manager };
        for (Employee emp : employees) {
            if (emp instanceof Interviewable) {
                ((Interviewable) emp).conductInterview();
            }

            if (emp instanceof Trainable) {
                ((Trainable) emp).attendTraining();
            }
        }

        System.out.println();
        MeetingRoom room = new MeetingRoom(participants);
        room.conductTraining();

        System.out.println();

room.filterByNameLength(5);

        List<String> upNames = MeetingRoom.empToUpper(List.of(employees));
        System.out.println("Имена в верхнем регистре:");
        for (String name : upNames) {
            System.out.println(name);
        }


    }
}
