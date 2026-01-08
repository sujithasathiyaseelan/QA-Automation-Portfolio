//SCANNER CLASS

import java.util.Scanner;

public class MyPharmacy {

	private String Name;
	int Price;
	int Quantity;
	public int score;
	
	public MyPharmacy() {
		// TODO Auto-generated constructor stub
	
	}
	public void GetMededicineInfo()//method to get input from the user
	{
		Scanner S= new Scanner(System.in);
		System.out.println("Enter the Name of the medicine =");
		Name=S.nextLine();//Reads the med name
		System.out.println("Display the Price =");
		Price=S.nextInt();//read the price
		System.out.println("Enter the Quantity =");
		Quantity=S.nextInt();//read the quantity
		
		}
	
	public void PrintMedcineDetails() {
		System.out.println("Name of the medicine ="+Name);
		System.out.println("Price="+Price);
		System.out.println("Quantity ="+Quantity);
		
	}

	private void Calculate()
	{
		int cost;
		cost = Price * Quantity;
	}

	

}
