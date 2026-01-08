import java.util.*;//MAP
public class Fruits {

	

	
	    public static void main(String[] args) {
	        // Create a Map
	        Map<Integer, String> r = new HashMap<>();
	        r.put(1, "Apple");
	        r.put(2, "Banana");
	        r.put(3, "Mango");
	        
	        

	        // Update values using entrySet
	        for (Map.Entry<Integer, String> entry : r.entrySet()) {
	            if (entry.getKey() == 2) {
	                entry.setValue("Orange"); // Update value for key 2
	            }
	        }

	        // Print updated map
	        for (Map.Entry<Integer, String> entry : r.entrySet()) {
	            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
	        }
	    }
	}
