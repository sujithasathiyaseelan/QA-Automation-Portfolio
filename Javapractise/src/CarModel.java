import java.util.ArrayList;//Arraylist
public class CarModel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  ArrayList<String> Car = new ArrayList<>();
		  ArrayList<Boolean>Car1=new ArrayList<>();//to declare boolean 
Car.add("BMW");
Car.add("Nissan");
Car.add("Kia");
Car.add("lucid");
Car1.add(true);
System.out.println("Car Models:");
for (String model : Car) {
    System.out.println(model);}
    
   // System.out.println("Total Make="+Car.size());//to get size 
    
    
Car.remove(3);//remove
   System.out.println("The size is="+ Car.size());
//    
   System.out.println("The Car Make is="+Car.get(0));//to get value in 0
    
}
}
