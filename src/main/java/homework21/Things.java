package homework21;

import java.util.ArrayList;
import java.util.*;

public class Things {
    public static void main(String[] args) {
        ArrayList<String> thing = new ArrayList<>();
        thing.add("почистить зубы");
        thing.add("поесть");
        thing.add("Java");
        System.out.println("Задачи, которые необходимо сделать сегодня:");
        System.out.println(thing);

        List<String> country = Arrays.asList("Moldova", "Romania", "Germany", "Russia",  "Moldova");

        Set<String> uniqueCountry = getUniqueValues(country);
        System.out.println(uniqueCountry);

    }

    public static Set<String> getUniqueValues(List<String> input) {
        return new HashSet<>(input);
    }

}
