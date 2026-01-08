
public class Animals implements Animal1{//INTERFACE 


@Override
public void makeSound() {
	// TODO Auto-generated method stub
	System.out.println("woof!");
}

@Override
public void name() {
	// TODO Auto-generated method stub
	System.out.println("The Animal is a DOG");
}
public void count() {
	System.out.println("4 Dogs");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animals A=new Animals();
		A.count();
		A.makeSound();
		A.name();
		
	

	}}