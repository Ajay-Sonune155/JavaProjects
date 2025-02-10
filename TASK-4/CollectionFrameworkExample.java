import java.util.*;

public class CollectionFrameworkExample {
    public static void main(String[] args) {
        // List Example
        List<String> list = new ArrayList<>(Arrays.asList("Java", "Python", "C++", "Java"));
        System.out.println("ArrayList: " + list);

        // Set Example
        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3, 2, 4));
        System.out.println("HashSet: " + set);

        // Queue Example
        Queue<String> queue = new LinkedList<>(Arrays.asList("A", "B", "C"));
        System.out.println("Queue: " + queue);
        queue.poll();
        System.out.println("Queue after poll: " + queue);

        // Map Example
        Map<Integer, String> map = new HashMap<>();
        map.put(101, "KaLu");
        map.put(102, "MaLu");
        map.put(103, "BhaLu");
        System.out.println("HashMap: " + map);

        // Iterating over List
        System.out.println("Iterating List:");
        list.forEach(System.out::println);

        // Iterating over Map
        System.out.println("Iterating Map:");
        map.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
