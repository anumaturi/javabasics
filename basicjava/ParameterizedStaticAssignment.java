//ASSIGNMENT 13-Parameterized Static method using char and boolean as parameters 
package basicjava;

public class ParameterizedStaticAssignment 
{ 
	static void gender(char a ,char b)
	{
		System.out.println(a);
	}
	
 static void  ticket(boolean a,boolean b)
 {

	 System.out.println("Female");
 }
 static void  details(char a,boolean b)
 {

	 System.out.println("Eligible");
 }
 public static void main(String[] args) {
	gender('f','M');
	ticket(true,false);
	details('f',true);

}
}
