


public class Replaceusingstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Python@Java";
//String b=s.replace("@","");
//System.out.println(b);

//String[] v=s.split("@");//Array divides into multiple string v[0]="Python",v[1]="Java"
//String e= String.join("",v);//concat the values of v into string
////System.out.println(e);



String[] v=s.split("@");//Array divides into multiple string v[0]="Python",v[1]="Java"
StringBuilder b= new StringBuilder();
for (String w:v) {
	b.append(w);}
	System.out.println(b.toString());

	}}

