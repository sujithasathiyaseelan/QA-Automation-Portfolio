import java.util.ArrayList;//Collections-----list ----copy and retain values
import java.util.List;

public class Groceries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> A= new ArrayList<String>();
List<String> B= new ArrayList<String>();
A.add("milk");
A.add("egg");
A.add("Yogurt");
B.addAll(A);
B.add("Fruits");//adding extra values in B and trying to print
B.add("Juice");
System.out.println(B);
System.out.println(B.retainAll(A));//check the values of A are in B
System.out.println(A.retainAll(B));


	}

}
