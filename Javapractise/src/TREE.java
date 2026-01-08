import java.util.*;
public class TREE {

    public static void main(String[] args) {
        // Create a Map
        Map<Integer, String> r = new HashMap<>();
        r.put(1, "Apple");
        r.put(2, "Banana");
        r.put(3, "Mango");
        
        Set<Integer> Keys=r.keySet();
        System.out.println(Keys);// To print only the keys
         Collection<String> Fruits=r.values();
         System.out.println(Fruits);//To print only the values 
        

//        // Loop through using entrySet()
//        for (Map.Entry<Integer, String> entry : r.entrySet())//
//        {
//            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
//        }
    }
}


//r is  Map.

//r.entrySet() returns a Set containing all entries (entry = key + value together).
//
//for (Map.Entry<Integer, String> entry : r.entrySet())
//Since the values are combination of int and string we are using Map.Entry<Integer, String> entry and trying to display all the values

//entry.getKey() ➔ gets the key (like 1, 2, 3).
//
//entry.getValue() ➔ gets the value (like "Apple", "Banana").


//When you do r.entrySet(), you get a Set of entries — and each entry represents one key-value pair from the map.

//The type of each entry is Map.Entry<K, V> — it's a small object that contains:
//
//the key (K)
//
//the value (V)
//
//So you use Map.Entry because you need access to both the key and the value together inside your loop


	