package homework22;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

        @Override
        public int hashCode () {
            return Objects.hash(name, age);
        }

        @Override
        public boolean equals (Object obj){
            if (this == obj) return true;
            if (!(obj instanceof Person)) return false;
            Person other = (Person) obj;
            return age == other.age && name.equals(other.name);
        }

        @Override
        public String toString () {
            return "Person{name='" + name + "', age=" + age + '}';
        }

        @Override
        public int compareTo (Person o){
            return this.name.compareTo(o.name);
        }

        public int getAge () {
            return age;
        }

}
