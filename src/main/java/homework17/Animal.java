package homework17;

public interface Animal {

static String Name = "Max";

    void eat();

    void emotion();

    void run();

  default void sound() {
        System.out.println("fruuuu");
    }


    static void gender() {
        System.out.println("Female");
    }


}
