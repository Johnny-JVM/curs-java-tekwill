package homework23;

import java.util.*;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, " Johnnny");
        map.put(2, " Ivan");
        map.put(3, " Ion");

        Queue<String> queue1 = new LinkedList<>();
        queue1.add("Apple");
        queue1.add("Banana");
        queue1.add("Cherry");

        Map<Integer, String> map1 = new HashMap<>(map);

        Queue<Map.Entry<Integer, String>> queue = new LinkedList<>();
        queue.addAll(map.entrySet());

        Stack<String> stack = new Stack<>();
        for (String value : map.values()) {
            stack.push(value);
        }

        Map<Integer, String> map33 = new HashMap<>();
        int index = 0;

        System.out.println(map1);

        System.out.println();

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        System.out.println();

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        System.out.println();

        while (!queue1.isEmpty()) {
            map33.put(index++, queue1.poll());
        }
        for (Map.Entry<Integer, String> entry : map33.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

    }
}
