// This program shows the usage of collection framework


import java.util.*;
public class CollectionFrameworkPractice {
    public static void main(String[] args) {

        // 1. ArrayList Example - A dynamic array that allows duplicates and maintains order
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Banana"); // Duplicates are allowed
        System.out.println("ArrayList: " + arrayList);  // Prints elements in the order they were added

        // 2. LinkedList Example - Works like a chain, fast for adding/removing but slow for searching
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.addFirst(5);  // Adding at the beginning
        linkedList.addLast(15);  // Adding at the end
        System.out.println("LinkedList: " + linkedList);

        // 3. HashSet Example - Stores only unique values, removes duplicates automatically
        Set<String> hashSet = new HashSet<>(arrayList);
        System.out.println("HashSet (removes duplicates): " + hashSet);  // Order is not guaranteed

        // 4. HashMap Example - Stores key-value pairs, great for fast lookup
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(101, "Alice");
        hashMap.put(102, "Bob");
        hashMap.put(103, "Charlie");
        System.out.println("HashMap: " + hashMap);
        System.out.println("Student with ID 102: " + hashMap.get(102)); // Fetching value by key

        // 5. TreeSet Example - Like HashSet but keeps values sorted
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(40);
        treeSet.add(10);
        treeSet.add(30);
        treeSet.add(20);
        System.out.println("TreeSet (sorted): " + treeSet);  // Elements are automatically sorted
    }
}
