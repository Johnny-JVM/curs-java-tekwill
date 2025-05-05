package homework21;

import java.util.ArrayList;
import java.util.Arrays;

public class RandomArray {
    public static void main(String[] args) {
        ArrayList<String> random = new ArrayList<>();
        random.add("one");
        random.add("two");
        random.add("three");
        random.add("four");
        random.add("five");

        ArrayList<String> random1 = new ArrayList<>();
        random1.add("one");
        random1.add("two");
        random1.add("three");
        random1.add("four");
        random1.add("five");
        random.remove(3);
        random.set(0, "Element zero");

        String[] massiv = random.toArray(new String[0]);

        int size = random.size();
        boolean tF = random.isEmpty();

        System.out.println(size);
        System.out.println(tF);
        System.out.println(random.equals(random1));
        System.out.println(Arrays.toString(massiv));

    }
}
