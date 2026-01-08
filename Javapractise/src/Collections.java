import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class Collections {

    public static void main(String[] args) {

        // 1. ArrayList – Allows duplicates, maintains order
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple"); // duplicate allowed
        System.out.println("ArrayList: " + fruits);

        // 2. HashSet – No duplicates, no order guaranteed
        HashSet<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Red"); // duplicate ignored
        System.out.println("HashSet: " + colors);

        // 3. HashMap – Key-value pairs, unique keys
        HashMap<Integer, String> students = new HashMap<>();
        students.put(1, "Alice");
        students.put(2, "Bob");
        students.put(1, "Charlie"); // key 1 overwritten
        System.out.println("HashMap: " + students);
        
        // Accessing value from HashMap
        System.out.println("Student with ID 2: " + students.get(2));
    }
}
