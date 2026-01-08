import java.util.HashMap;
import java.util.Map;//Checking duplicate value using Map

public class Rainbow {

	
	    public static void main(String[] args) {
	        String word = "windows";
	        Map<Character, Integer> Count = new HashMap<>();

	        for (char c : word.toCharArray()) {
	            Count.put(c, Count.getOrDefault(c, 0) + 1);
	        }

	        System.out.println(Count);
	    }}