package homework25;

import java.util.Objects;

public class Employee {
    private String name;
    private int age;
    private boolean isPayedPerHour;

    public Employee(String name, int age, boolean isPayedPerHour) {
        this.name = name;
        this.age = age;
        this.isPayedPerHour = isPayedPerHour;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isPayedPerHour() {
        return isPayedPerHour;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Employee)) return false;
        Employee other = (Employee) obj;
        return name.equals(other.name) &&
                age == other.age &&
                isPayedPerHour == other.isPayedPerHour;
    }

    @Override
    public String toString() {
        return name + "(age" + age + ", horly: " + isPayedPerHour + ")";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, isPayedPerHour);
    }

}
