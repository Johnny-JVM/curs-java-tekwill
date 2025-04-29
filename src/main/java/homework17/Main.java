package homework17;

public class Main {
    public static void main(String[] args) {

        Animal elephant = new Elephant();

        String name = Animal.Name;
        Animal.gender(); //static
        elephant.run();
        elephant.eat();
        elephant.sound(); //default
        elephant.emotion();

        System.out.println();

        Herbivore makaka = new Elephant();
        makaka.name1();
        makaka.age();

    }
}
