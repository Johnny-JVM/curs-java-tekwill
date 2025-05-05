package homework22;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Person> people = new TreeSet<>();

        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 65));
        people.add(new Person("Charlie", 72));
        people.add(new Person("Dave", 40));
        people.add(new Person("Edward", 90));

        System.out.println("Люди страше 60 лет:");
        for (Person person1 : people) {
            if (person1.getAge() > 60) {
                System.out.println(person1);
            }

        }
    }
}
