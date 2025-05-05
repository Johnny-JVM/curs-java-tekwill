package homework21;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    public static void main(String[] args) {
        Map<String, String> words = new HashMap<>();
        words.put("Cat", "Кошка");
        words.put("Dog", "Собака");
        words.put("Bird", "Птица");
        words.put("Lion", "Лев");
        words.put("Monkey", "Обезьяна");
        words.put("Crocodile", "Крокодил");
        words.put("Chicken", "Курица");
        words.put("Cow", "Корова");
        words.put("Human", "Человек");
        words.put("Book", "Книга");

        System.out.println(words);

    }


}
