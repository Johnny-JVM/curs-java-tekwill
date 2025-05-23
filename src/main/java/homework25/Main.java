package homework25;


import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Manager("Johnny", true, 30),
                new Manager("Victoria", true, 19),
                new Manager("Dima", false, 20),
                new Manager("Iura", true, 55),
                new Manager("Artem", false, 22),
                new Manager("Olga", true, 16),
                new Manager("Iura", true, 55),
                new Manager("Sofia", false, 32),
                new Employee("Vito", 45, true),
                new Programmer("Nina", 50, true)
        );

        List<Employee> filtred = employees.stream()
                .filter(e -> e instanceof Interviewable)
                .filter(e -> e.getAge() > 25)
                .filter(Employee::isPayedPerHour)
                .filter(e -> e instanceof Manager)
                .distinct()
                .limit(5)
                .collect(Collectors.toList());

        filtred.forEach(System.out::println);
        System.out.println();

        List<String> filtredName = employees.stream()
                .filter(e -> !e.isPayedPerHour())
                .filter(e -> e.getAge() > 30)
                .map(Employee::getName)
                .sorted()
                .collect(Collectors.toList());

        filtredName.forEach(System.out::println);
        System.out.println();

        List<Employee> filtredIt = employees.stream()
                .filter(e -> e instanceof Interviewable)
                .filter(e -> e instanceof Trainable)
                .filter(e -> e instanceof Programmer)
                .collect(Collectors.toList());

        filtredIt.forEach(System.out::println);
    }
}
