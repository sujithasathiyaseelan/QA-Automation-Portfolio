
public class Mathhelper {//Static Method 
public static int sub(int a, int b) {//static method
	return a-b;}
	public void getresult() {//normal method 
		System.out.println("This the output ");
		
	}
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
int output=Mathhelper.sub(5, 3);//no object creation for static method
System.out.println(output);
Mathhelper M=new Mathhelper();
M.getresult();


	}

}
