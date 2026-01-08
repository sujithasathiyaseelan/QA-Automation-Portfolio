import java.util.ArrayList;//list,SSet,Map
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ShopingCartSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>Cart=new ArrayList<>();//List to display all the items 
		Cart.add("Cookie");
		Cart.add("Milk");
		Cart.add("Eggs");
		Cart.add("Onions");
		Cart.add("Toamtoes");
		Cart.add("Toamtoes");
		Cart.add("Milk");
		Cart.add("Eggs");
		Cart.add("Onions");
		
		
		System.out.println("Grocery list="+Cart);//Set to display unique items
		 Set<String>Unique=new HashSet<>(Cart);
		 System.out.println("Display Unique Items="+Unique);
		 
		 
		 Map<String,Integer>Count=new HashMap<>();//Map to display the count
		 for (String C : Cart) {
	            if (Count.containsKey(C))//Checks if the item (C) is already recorded in the Count map.
	            {
	                Count.put(C, Count.get(C) + 1);//If the item already exists in the map, increase its count by 1.
	                //Count.get(C) retrieves the current count, then we add 1 and update the map.
	            } else {
	                Count.put(C, 1);//If the item isn’t in the map yet, add it with an initial count of 1.
	            }
	        }

			 //Count.put(C,Count.getOrDefault(C,0)+1);//
		 
		 System.out.println(Count);
}}

// why put?----Adds a new key-value pair if the key doesn't exist.

//Updates the value if the key already exists.
