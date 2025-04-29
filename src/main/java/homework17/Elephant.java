package homework17;

public class Elephant extends Herbivore implements Animal {


    @Override
    public void eat() {
        System.out.println("Занятие- " + "Eatinggg");
    }

    @Override
    public void emotion() {
        System.out.println("Чувствует- " + "So Happy");
    }

    @Override
    public void run() {
        System.out.println("Хобби- " + "Running...");
    }

    @Override
    public void age() {
        System.out.println("Year- " + "10");
    }
}
