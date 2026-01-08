import java.util.ArrayList;
import java.util.List;

public class Checkvalues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> i=new ArrayList<Integer>();
		i.add(34); 
		i.add(45);
		i.add(78);
		i.add(90);
		i.add(2, 59);//Insert number
		i.remove(4);//remove number
		i.set(0, 100);//modify number
		boolean b=i.contains(90);//to check value using boolean
		boolean b1=i.contains(45);
		System.out.println(b1);
		System.out.println(b);
		System.out.println(i);
		

	}

}
